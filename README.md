Домашнее задание №3
Описание разработки.
------------------------------

Интерфейсы:
- Movement (move(), stop())
- Refuel (refuel(), getFuelLevel())

Абстрактный класс для всех ТС:
- Transportprops (name, maxSpeed, capacity)

Классы транспорта:
- Car (наследует Transportprops, реализует Refuel)
- Airplane (наследует Transportprops, реализует Refuel) 
- Ship (наследует Transportprops, реализует Refuel)
- Bicycle (наследует Transportprops)

Двигатели:
- Engine (запечатанный класс, только для DVSEngine и REactiveEngine)
- DVSEngine (наследует Engine)
- REactiveEngine (наследует Engine)

Связи:
Car, Airplane, Ship содержат Engine
