## Решение ##

Реализую решение задачи на языке Java.
1. Создаем исходный массив;
2. Создаем новый массив, который равен исходному массиву который прошел основной метод;
3. Выводим исходный массив в терминал;
4. Выводим новый массив в терминал;



### Основной метод ###
1. в основной метод передаем исходный массив в качестве аргумента;
2. создаем новый массив по длине совпадающий с исходным и заполненный значениями null;
3. создем переменную index = 0 (которая используется как индекс и как счетчик, считая элементы проходящие в новый массив);
4. берем элемент из исходного массива;
5. проверяем количество символов в этом элементе: 
>>- если количество символов соответствует условию, то добавляем его в новый массив и увеличиваем index на единицу; 
>>- если не соответсвует, то пропускаем; 
6. берем следующий элемент. И так до конца массива. 
7. если в новом массиве остались значения null: 
>> - корректируем длину нового массива методом copyOf() и возвращаем его;
>> - метод copyOf() получает в качестве аргументов новый массив и index;
8. блок схема:


![блок схема основного метода](Untit.png)
