/** [8]
* Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes regras:
* O primeiro número de C é o primeiro número de A;
* O segundo número de C é o primeiro número de B;
* O terceiro número de C é o segundo número de A;
* O quarto número de C é o segundo número de B;
* Assim sucessivamente. Caso os números de A ou B sejam de tamanhos diferentes, completar C com o
* restante dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256
* Caso C seja maior que 1.000.000, retornar -1
*
* Desenvolva um algoritmo que atenda a todos os requisitos acima.
*/

package br.com.invillia.exercise_8;

public class ValueC {

    public int createCValue(int a, int b) {
        StringBuilder sb = new StringBuilder();

        int length;
        int lengthA = String.valueOf(a).length();
        int lengthB = String.valueOf(b).length();

        if (lengthA >= lengthB) {
            length = lengthA;
        } else {
            length = lengthB;
        }

        for (int index = 0; index < length; index++) {
            if (index < lengthA) {
                sb.append(String.valueOf(a).charAt(index));
            }
            if (index < lengthB) {
                sb.append(String.valueOf(b).charAt(index));
            }
        }

        int c = Integer.parseInt(sb.toString());
        System.out.println("Valor de C:" + c);

        return c < 1000000 ? c : -1;
    }

}