package lessons.lesson7.src.java._10_02_2023;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

public class HaffMan {
    public static void main(String[] args) {
        String text = "PlayStation 5 - це нова консоль від Sony, яка була випущена в " +
                "кінці 2020 року. Вона має мощну апаратну конфігурацію, яка дозволяє грати в гри" +
                " з високою роздільною здатністю та плавністю.\n" +
                "\n" +
                "Однією з головних особливостей PlayStation 5 є підтримка т" +
                "ехнології Ray Tracing, яка дозволяє відтворювати реалістичні ефекти " +
                "освітлення та тенів. Консоль також підтримує високу частоту оновлення екрану," +
                " що дозволяє грати в гри з більшою плавністю.\n" +
                "\n" +
                "Інтерфейс PlayStation 5 змінився згідно з попередніми консолями Sony. " +
                "Він став більш зрозумілим та зручним для користування. Консоль також має нову " +
                "функцію \"Режим безперервного гравця\", яка дозволяє безперервно переходити між " +
                "різними грами без потреби повторної загрузки";

        TreeMap<Character, Integer> frequencies = countFrequency(text);

        ArrayList<CodeTreeNode> codeTreeNodes = new ArrayList<>();

        for (Character c : frequencies.keySet()){
            codeTreeNodes.add(new CodeTreeNode(c, frequencies.get(c)));
        }

        CodeTreeNode tree = huffman(codeTreeNodes);

        TreeMap<Character, String> codes = new TreeMap<>();

        for (Character c : frequencies.keySet()){
            codes.put(c, tree.getCodeForCharacter(c, ""));
        }

        System.out.println("Table of codes: " + codes);

        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            encoded.append(codes.get(text.charAt(i)));
        }

        System.out.println("розмір вихідного коду - " + text.getBytes().length * 8 + " bit");
        System.out.println("розмір зжатої строки - " + encoded.length() + " bit");
        System.out.println("Біти зжатої строки - " + encoded);

        String decoded = huffmanDecode(encoded.toString(), tree);

        System.out.println("Декодований текст - " + decoded);
    }

    //count char

    private static TreeMap<Character, Integer> countFrequency(String text){
        TreeMap<Character, Integer> freqMap = new TreeMap<>();
        for (int i = 0; i <text.length() ; i++) {
            Character c = text.charAt(i);
            Integer count = freqMap.get(c);
            freqMap.put(c, count != null ? count + 1 : 1);
        }
        return freqMap;
    }

    private static class CodeTreeNode implements Comparable<CodeTreeNode> {

        Character content;

        int weight;

        CodeTreeNode left;
        CodeTreeNode right;

        public CodeTreeNode(Character content, int weight) {
            this.content = content;
            this.weight = weight;
        }

        public CodeTreeNode(Character content, int weight, CodeTreeNode left, CodeTreeNode right) {
            this.content = content;
            this.weight = weight;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(CodeTreeNode o) {
            return o.weight - weight;
        }

        public String getCodeForCharacter(Character ch, String parentPath){
            if (content == ch){
                return parentPath;
            } else {
                if (left != null){
                    String path = left.getCodeForCharacter(ch, parentPath + 0);
                    if (path != null){
                        return path;
                    }
                }
                if (right != null){
                    String path = right.getCodeForCharacter(ch, parentPath + 1);
                    if (path != null){
                        return path;
                    }
                }
            }
            return null;
        }
    }

    private static CodeTreeNode huffman(ArrayList<CodeTreeNode> codeTreeNodes){
        while (codeTreeNodes.size() > 1){
            Collections.sort(codeTreeNodes);

            CodeTreeNode left = codeTreeNodes.remove(codeTreeNodes.size() - 1);
            CodeTreeNode right = codeTreeNodes.remove(codeTreeNodes.size() - 1);

            CodeTreeNode parent = new CodeTreeNode(null, right.weight + left.weight, left, right);

            codeTreeNodes.add(parent);
        }
        return codeTreeNodes.get(0);
    }

    private static  String huffmanDecode(String encoded, CodeTreeNode tree){
        StringBuilder decoded = new StringBuilder();

        CodeTreeNode node = tree;

        for (int i = 0; i < encoded.length(); i++) {
            node = encoded.charAt(i) == '0' ? node.left : node.right;

            if (node.content != null) {
                decoded.append(node.content);
                node = tree;
            }
        }
        return decoded.toString();
    }

}