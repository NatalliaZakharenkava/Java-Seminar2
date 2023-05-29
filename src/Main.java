//1) Дана строка sql-запроса "select * from students where ".
//   Сформируйте часть WHERE этого запроса, используя StringBuilder.
//   Данные для фильтрации приведены ниже в виде json-строки.Если значение null,
//   то параметр не должен попадать в запрос.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
//                Map<String, String> params1 = new HashMap<String,String>();
//                params1.put("name","Ivanov");
//                params1.put("country","Russia");
//                params1.put("city","Moscow");
//                params1.put("age",null);
//                System.out.println(getQuery(params1));
//            }
//            public static String getQuery(Map<String, String> params)
//            {
//                StringBuilder s = new StringBuilder();
//                for (Map.Entry<String,String> pair : params.entrySet())
//                {
//                    if (pair.getValue() != null)
//                    {
//                        s.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
//                    }
//                }
//                s.delete(s.toString().length()-5,s.toString().length());
//                return s.toString();

//    2) Реализуйте алгоритм сортировки пузырьком числового массива,
//       результат после каждой итерации вывести в консоль.

        int[] numbers = {11, 3, 14, 16, 7};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

        public static void bubbleSort ( int[] items){
            int stepsCount = items.length - 1;
            boolean swapped;
            do {
                swapped = false;
                for (int i = 0; i < stepsCount; i++) {
                    if (items[i] > items[i + 1]) {
                        int temp = items[i];
                        items[i] = items[i + 1];
                        items[i + 1] = temp;
                        swapped = true;
                    }
                }
                stepsCount--;
            } while (swapped);

        }
    }