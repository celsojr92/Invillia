package br.com.invillia;

import br.com.invillia.exercise_8.ValueC;
import br.com.invillia.exercise_9.BinaryTree;


public class Main {

    public static void main(String[] args) {

	    //exercise_8

        System.out.println("\nexercise_8");
        ValueC valueC = new ValueC();
        System.out.println("Result 1: " + valueC.createCValue(11, 22)); //Result 1212
        System.out.println("Result 2: " + valueC.createCValue(10256, 512)); //Result 15012256

        //FIM

        //exercise_9

        System.out.println("\nexercise_9");

        BinaryTree atThe = new  BinaryTree();
        BinaryTree right = new  BinaryTree();
        BinaryTree left = new  BinaryTree();

        BinaryTree rightRight = new  BinaryTree();
        BinaryTree rightLeft = new  BinaryTree();
        BinaryTree leftRight = new  BinaryTree();
        BinaryTree leftLeft = new  BinaryTree();

        atThe.setValor(1);
        atThe.setLeft(left);
        atThe.setRight(right);

        left.setValor(2);
        left.setLeft(leftLeft);
        left.setRight(leftRight);

        right.setValor(3);
        right.setLeft(rightLeft);
        right.setRight(rightRight);

        leftLeft.setValor(4);
        leftRight.setValor(5);
        rightLeft.setValor(6);
        rightRight.setValor(7);

        System.out.println("atThe: " + new BinaryTree().sum(atThe));
        System.out.println("left: " + new BinaryTree().sum(left));
        System.out.println("right: " + new BinaryTree().sum(right));

        //FIM
    }
}
