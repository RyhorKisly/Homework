package Homework_from_Roman.hw1;

public class Solution {

    //		Задание 1
//		Есть некоторый массив, состоящий из целых чисел, также есть некоторое
//		число "n". Суть задания посчитать сумму всех элементов массива, однако
//		если в массиве встречается число "n" то в сумму его включать не нужно.

//		int n = 5;
//		int[] array = {2, 5, 7, 3, 6, 10};
//		int sum = 0;
//		for (int element : array) {
//			if (element != n) {
//				sum += element;
//			}
//		}
//		System.out.println(sum);









//		Задание 2
//		Суть задания найти сумму всех четных чисел в последовательности
//		Фибоначи, до определенного индекса "n".
//		Например:
//		Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
//		n = 7
//		Сумма всех четных до 7го.  равна 2 + 8 = 10.

//		int prePreviousVal = 0;
//		int previousVal = 1;
//		int sum = 0;
//		int n = 7;
//
//		for (int i = 2; i < n; i++) {
//			int temp = prePreviousVal + previousVal;
//			if (temp % 2 == 0) {
//				sum += temp;
//			}
//			prePreviousVal = previousVal;
//			previousVal = temp;
//		}
//		System.out.println(sum);








//		Задание 3
//		Дан некоторый массив, суть задания инвертировать его.

//		int[] array = {3, 5, -2, 4, 4, 2, 8, 1};
//		for (int i = 0; i < array.length / 2; i++) {
//			array[i] = array[i] + array[array.length - 1 - i];
//			array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
//			array[i] = array[i] - array[array.length - 1 - i];
//		}
//		System.out.println(Arrays.toString(array));








//		Задание 4
//		Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
//		положительных или отрицательных.

//		int[][] array = {{3, 4, -2}, {-5, 2, 1}};
//		int counter = 0;
//
//		for (int[] subArray : array) {
//			for (int element : subArray) {
//				if (element > 0) {
//					counter++;
//				} else {
//					counter--;
//				}
//			}
//		}
//		if (counter == 0) {
//			System.out.println("=");
//		} else {
//			System.out.println(counter > 0 ? "+" : "-");
//		}





//		Задание 5
//		Дан некоторый двумерный массив. Нужно определить является ли он нижней
//		треугольной матрицей или же нет.

//		int[][] array = {
//				{1, 0, 0, 0, 0},
//				{2, 1, 0, 0, 0},
//				{3, 5, 6, 0, 0},
//				{1, 0, 5, 7, 0},
//				{0, 8, 9, 1, 3}
//		};
//
//		boolean isTriangle = true;
//		label:for (int i = 0; i < array.length - 1; i++) {
//			if(array[i].length != array.length) {
//				return;
//			}
//			for (int j = i + 1; j < array[i].length; j++) {
//				if (array[i][j] != 0) {
//					isTriangle = false;
//					break label;
//				}
//			}
//		}
//		System.out.println(isTriangle);






//		Задание 6
//		Даны две квадратные матрицы. Необходимо написать программу которая посчитает их
//		сумму и разности.

//		int[][] matrix1 = {{8, 2}, {3, 4}};
//		int[][] matrix2 = {{1, 4}, {2, 6}};
//		int[][] matrixSum = new int[2][2];
//		int[][] matrixDif = new int[2][2];
//
//		for (int i = 0; i < matrix1.length; i++) {
//			for (int j = 0; j < matrix1[i].length; j++) {
//				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
//				matrixDif[i][j] = matrix1[i][j] - matrix2[i][j];
//			}
//		}
//
//		System.out.println("Сумма матриц:");
//		for (int[] subArray : matrixSum) {
//			for (int element : subArray) {
//				System.out.print(element + "  ");
//			} System.out.println("");
//		}










//		Задание *
//		Есть некоторый массив из целых положительних чисел. [1, 0, 4, 8, 9, 1]
//		Необходимо написать программу которая посчитает максимально возможную сумму
//		которую можно получить из данного массива, с условием что элементы включенные в
//		сумму не должны стоять на соседних индексах (должен быть минимум один елемент
//				между ними).
//
//		Для предложенного массива это: 1, 4, 9 = 14.

//		int[] array = {2, 1, 5, 6, 0, 3, 10, 20, 0, 0, 0, 0, 30};
//		int sum = array[0];
//		int prevSum = 0;
//
//
//		for (int i = 1; i < array.length; i++) {
//			int temp = sum;
//			sum = Math.max(Math.max(prevSum + array[i], array[i]), sum);
//			prevSum = temp;
//		}
//
//		System.out.println(sum);






//		Задание *
//		N студентов стоят в очереди за стипендией. Каждый студент имеет учебный рейтинг.
//		Деканат должен выдать стипендию таким образом, чтобы: каждый студент получил хотя
//		бы 1 рубль, студенты с более высоким рейтингом получили больше рублей, чем их
//		соседи в очереди. Копеек в деканате нет. Какое минимальное количество рублей
//		должно быть у деканата? На вход подаётся массив из N элементов, содержащий
//		рейтинги для каждого студента. На выходе ожидается число, обозначающее минимальное
//		количество рублей, которых должно хватить студентам.
//		Пример:
//		Вход: [1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2]
//		Выход: 47



//		public static int findMinMoneyAmount(int[] studentsQueue) {
//			int minMoney = 0; int[] studentsMoney = new int[studentsQueue.length];

//			for (int i = 0; i < studentsQueue.length; i++) {
//				studentsMoney[i] = 1;
//				if (i - 1 >= 0 && studentsQueue[i] > studentsQueue[i - 1]) {
//					studentsMoney[i] = studentsMoney[i - 1] + 1; continue;
//				} int tempI = i;
//				while (tempI - 1 >= 0 && studentsQueue[tempI - 1] > studentsQueue[tempI] && studentsMoney[tempI - 1] == studentsMoney[tempI]) {
//					tempI--; studentsMoney[tempI] = studentsMoney[tempI] + 1;
//				}
//			}

//			for (Integer i : studentsMoney) {
//				minMoney += i;
//			}
//			return minMoney;
//		}

//		public static int findMinMoneyAmount_O2n(int[] studentsQueue) {
//			int minMoney = 0; int[] studentsMoney = new int[studentsQueue.length];

//			for (int i = 0; i < studentsQueue.length; i++) {
//				studentsMoney[i] = 1;
//				if (i - 1 >= 0 && studentsQueue[i] > studentsQueue[i - 1]) {
//					studentsMoney[i] = studentsMoney[i - 1] + 1;
//				}
//			}
//			for (int i = studentsQueue.length - 1; i >= 0; i--) {
//				if (i - 1 >= 0 && studentsQueue[i] < studentsQueue[i - 1] && studentsMoney[i - 1] <= studentsMoney[i]) {
//					studentsMoney[i - 1] = studentsMoney[i] + 1;
//				} minMoney += studentsMoney[i];
//			}
//			return minMoney;
//		}

}
