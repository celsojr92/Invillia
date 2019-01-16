/** [9]
* Considerando a estrutura de uma árvore binária:
* public class BinaryTree {int valor; BinaryTree left; BinaryTree right;}
* Desenvolva um método que dado um nó da árvore calcule a soma de todos os nós subsequentes.
*/

package br.com.invillia.exercise_9;

public class BinaryTree {

    private int valor;
    private BinaryTree left;
    private BinaryTree right;

    public int getValor() {

        return valor;
    }

    public void setValor(int valor) {

        this.valor = valor;
    }

    public BinaryTree getLeft() {

        return left;
    }

    public void setLeft(BinaryTree left) {

        this.left = left;
    }

    public BinaryTree getRight() {

        return right;
    }

    public void setRight(BinaryTree right) {

        this.right = right;
    }

    public int sum(BinaryTree node) {

        return node != null ? node.getValor() + sum(node.getLeft()) + sum(node.getRight()) : 0;
    }

    @Override
    public String toString() {

        return "Result BinaryTree{" + "valor: " + valor + ", left: " + left + ", right: " + right + '}';
    }

}
