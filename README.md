# Memento
Шаблон "Хранитель" используется для восстановления состояния объекта до предыдущего состояния. Образец воспоминания попадает в категорию поведенческих образцов.
## Назначение программы
Показать практическое применение шаблона "Хранитель" по теме "Диаграмма деятельности".

Классы Begin, Operation, Solution - описание узло диаграммы деятельности

Класс Memento – сохраняет состояние объекта Originator;

Класс Originator – создает экземпляр объекта хранителя. Имеет полный доступ к Memento.

Класс Caretaker – производит сохранения множества состояний Memento в стеке для извелчения в порядке сохранения.
## Диаграмма классов

![0](https://user-images.githubusercontent.com/85245803/122017258-7c740c00-cdca-11eb-94c0-5d98f5cac5ab.png)

## Работа программы
Запуск программы

![1](https://user-images.githubusercontent.com/85245803/122017283-81d15680-cdca-11eb-99e1-1e33c4249f3c.png)

Работа кнопок "Начальный узел", "Узел управления", "Узел решения"

![4](https://user-images.githubusercontent.com/85245803/122017369-944b9000-cdca-11eb-9bb0-5df27541ef71.png)
![2](https://user-images.githubusercontent.com/85245803/122017374-94e42680-cdca-11eb-8db8-a3b2678b9071.png)
![3](https://user-images.githubusercontent.com/85245803/122017376-94e42680-cdca-11eb-97ab-b7dc31e37a3b.png)

При перемещении объекта он выделяется, после того, как отпустить кнопку мыши, текущее состояние объекта запишется в экземпляр класса CareTaker

![5](https://user-images.githubusercontent.com/85245803/122017642-d4ab0e00-cdca-11eb-860f-bc6a5bede871.png)
![6](https://user-images.githubusercontent.com/85245803/122017646-d543a480-cdca-11eb-9a04-9daf98e8bcc6.png)

При нажатии кнопки "Отменить" объект возвращается в предудыщий момент времени до перемещения

![7](https://user-images.githubusercontent.com/85245803/122017806-f86e5400-cdca-11eb-8e8d-4fd0fc603d4d.png)

При нажатии кнопки "Начало" объект возвращается в исходное положение до всех перемещений

![8](https://user-images.githubusercontent.com/85245803/122017874-08863380-cdcb-11eb-80da-263a06c654ce.png)

Кнопка "Очистить" убирает объект

Действие кнопки "Закрыть" прекращает работу программы
