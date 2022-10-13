package Homework_from_Roman.hw1;

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