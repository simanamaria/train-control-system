# CargoCompany
## Side Project
- there is an entity `Cargo`: `number,` `weight` + other fields if necessary.
- there is `User`: `firstName`, `lastName`, `age`. There are two types of `Users`:
	- `Passenger` is a `User` with a `Ticket.`
	- `Driver` is a `User` with a `Licence.`
- there are three types of `Carriages`:
	- there is a `Passenger` carriage with a certain `numberOfSeats,` and you can add people (`Users`) with `Tickets` to the corresponding `seats.`
	- there is a `Freight` carriage: `carryingCapacity` and the ability to load `Cargo` with `weights` loaded within the limits of `carryingCapacity.`
	- there is a `Locomotive`: `Driver` is a `User` (with `age` > 18 years and valid `License`)
- there is a `Train`: `number` + linked `Carriages` (implement independently with a linked list without using the `LinkedList` class)
- class design + tests, logs, and maven required
- use collections
### Cargo
We have a cargo entity (`Cargo`) with a `Weight.`
It is clear that when you hear “entity cargo,” you need to think about what fields are required and what fields will be `Immutable.` How to define `equals()` and `hashCode(),` and you will probably come up with some `id.` Try to turn on fantasy as if you are writing a project. Imagine you have an idea. You want to make a control system for the Railway station or Train Depot. If we talk about cargo, there should be some `number` which defines it or maybe an `id.` But the main thing is that `Cargo` must have `weight.` Plus, some more fields. There is room for your imagination.
### User
There is a `User`: it has `firstName` and `lastName,` it has an `age,` and we will leave it for now. `User` - it can be just `User,` and there can also be some extensions of this `User.` 
- `User` plus a `Ticket` is already a `Passenger.` 
- `User` with `License` is a `Driver.` 
Think of some solutions. There is no definitive good solution here.
### Carriage
#### Coach (Passenger Carriage)
There is a `PassengerCarriage,` where there is a certain `numberOfSeats,` and you can add people (`Users`) with `Tickets` for the corresponding `Seat.`
#### Freight Carriage
There is a `FreightCarriage`; you can add fields that you see fit, with a `carryingCapacity` and the ability to load `Cargo` within the `carryingCapacity` limits.
#### Locomotive
There is a `Locomotive`: `Driver` is a `User` (over 18 years old and licensed)
### Train
There is a `Train`: `Train` has a `number` or `id` plus linked  `Carriages` (implement a linked list that you must define by yourself). `Train` has to have a `head,` which has to be a `Locomotive` `Carriage.` It sits somewhere in the beginning, and then we link `Freight` or `Passenger``Carriages` to it. Implement linkage of `Carriages` without using the `LinkedList` class. You have to define your own `LinkedList.` Class `Node<E>` is the element of the `Train.` We need to connect nodes and add more things typical for trains if we need.
## General remarks
It all needs to be designed. The inheritance should be defined. This is a business domain. Here I say directly that there are three types of `Carriages`: `Locomotive,` `Couch` (Passenger carriage), and `Freight.` We need to collect a train from all of these instances.
You must make proper class design, tests, logs, and `maven.` And there is a question if we need logging or not. Because in domain entities, it may not be necessary. It is not required to log inside domain classes. Logs by type: the train is assembled, and such and such a passenger is added. Although this is not strictly needed, I will not say it is bad practice. Ticket validation can be done here. Use collections.

### Hints
It turns out that we have assembled the train and can continue to work with it. I remember they approached this problem in the last school very interestingly. Some methods wrote `choo-choo` to the `console.` It’s a little extra; the train will not run. We’re building just a train control system. Some practical application is expected. One comes in and says. Imagine a graphical interface if you develop it. Click create a `Train.` The `number` is generated. You set the number, and that's it - there is a train. It is not yet complete. Looked at some carriages. What carriages are available? Then one adds `Cargo` to the `Freight Carriages` or `Passengers` with `Tickets.` And it all has to work somehow. You can add some services you develop on your own if you like. 
Let's make a `deadline.` Two weeks is enough, but since we still have the main project running parallel, let’s increase it to four weeks.

The main principle of this side project is quality first. If someone doesn’t have enough time, you write, say that I do not have time to do it qualitatively. Let's move the `deadline.` I expect outstanding quality. Every piece must be thought out. It's not a task to make a fuss here. We have already talked a lot. You have already looked at a lot of code. It would help if you tried to make everything as good as possible. If I see a piece of code that is not covered by tests, I’ll ask why tests do not cover it. So it won't be good. It’s not that you need to crack and make that quality you can't. Think well. Do not hurry.
 I'm not very happy when I see poorly formatted code or very few tests. This is not a task where you need to say. Here, I showed how I could write tests using one example. I want to see how you would make this code for the project. 

For the project, you need to write all the tests you can. Maximum quality. Tests, of course, can be with `Mockito` and just Unit Tests. With `Mockito,` there may be fewer tests. Because here, they are domain entities. No one forbids these trains to collect, look at, or do something with them.

Why do I give a lot of time? Not because the task is too complex. One can have a question, the task is not very difficult, but there is a lot of time. Try to start writing. It's not that easy there — everything should be covered with tests, with logging.

The main thing is to design entities; services are not required here. If someone wants a service, like creating a train, it is not clear what to pass there. `createTrain()` will get some already assembled train. Or `add(Carriage)` to the `Train.` You can write like this. If someone wants, then write, but it is not required.

## Clarification on class design
### Design questions.
#### How complex should these classes be initially as entities?
They must have some fields. Well, to make it more interesting. For this, I, of course, will not be able to show you anything if you make the minimum required fields. But you imagine you decide to do a `start-up` for freight management: trains and more. You don't know yet. You don't have any clients. Just imagine that you have trains, carriages, passengers, and others here. You need to make some prototypes. Therefore, it is necessary to saturate it so that it is interesting.
Well, what does the train have there? The train, in addition to the carriages, has a number. Yes, that's all. The train is a collection of carriages. It may have cargo, be a passenger train, or both. Well, there is no fanaticism, that is. This is also a number, some details, and so on.
#### Should classes be in control of themselves?
It is better to write classes so that they control themselves. But they should control themselves as little as possible. Here, the data structure is such a thing that will solve all the questions. Service here is optional. No special services are needed. Because here, it is just the idea to show that classes will be such a nesting doll. Matryoshka, then look at how you start to write.  
For example, if I add a `Cargo` load to the `Passenger Carriage,` let the car throw an error and check it. It would be stupid if some service took from the car and asked, how much cargo do you already have? And why, what, and how? Fits or doesn't fit?
It is visible which approach is better. Because all of a sudden, someone will start to load the `Freight Carriage` himself, he will start to shove cargo into it through your service.
There are two different approaches here. And such, and such would have gone down in something. But generally, it is better to hang up validation on some methods. They should be a little `defensive.`
Do not be too zealous in the filling, without fanaticism, but make it enjoyable.
Well, tests, of course, are needed.
#### How to start to develop a task?
I imagine it's just the `main` method that will. Well, you can even start from the opposite. To tell
`Train train = new Train("1224452324");`
I'm not suggesting it. I’m just writing. There must be a driver in `Locomotive.`
`train.addCarriage(new Locomotive(new Driver()));`
Then add `addCarriage`, `new PassengerCarriage`
`train.addCarriate(new PassengerCarriage);`
Then add a freight car.
`CargoCarriage cc = new CargoCarriage;`
`cc.addCargo()`
`CargoCarriage` must check whether this cargo fits, and this `CargoCarriage` knows how to properly store this `Cargo` there. Otherwise, these classes are useless.
It may be different here. You can either throw `Exception.` Again, there is no correct answer here. Or it can return a result. Say `addCargo()` and we returned `boolean` for example. `Boolean` means fit/not fit. If it doesn't fit, then how can we do it?
It is possible to make a method for `train,` or to use `train` methods is probably illogical. You can go through all `Carriage,` find all `CargoCarriage` and follow the chain there. Using any logic, try to load into them.
To say that here is the first car, whether the extra load fits or not. Doesn't fit, bad. Let's try to load it into the next freight car. Or look for something else.
####  Is it necessary to saturate them with various auxiliary methods? Should some services do the task?
Here we get more emphasis on the design of classes and a little on the collection.
If anyone thinks there is a hidden meaning here, it's a catch. Nothing so supernatural. So that it is one month, not because the task is somehow complicated. It can be done in fifteen minutes, but maybe with tests, spend a couple more hours on tests so that most of the Code is covered with tests. To check that everything is fine, loading / not loading, passengers with tickets admitted but do not admit passengers without tickets.
If someone strongly wanted to do it through the services. Just making classes with `getters&setters` is not very good. They will then be `mutable` all. They will then be just stupid containers. The types will lose their `consistency` and their integrity. It turns out that there will be some overloaded `Freight Carriages.` No validation. A locomotive with some driver that isn't a driver.
Remember, I said the code should look a little like business requirements, like text. It is desirable that the code would take as little place as possible.
Suppose I open it and see that some method is complicated here, that it loads something shorter somewhere. You might end up with your service converging into some hellish code that does who knows what. Classes should not be very smart but with minimal protection, with minimal logic. That is the business logic itself. There will be very little of it, as I wrote in the example above. I took a `train,` collected it, and loaded the loads. You go into the methods of this `train`; the methods are all simple. They pull other methods, from `Cargo,` from `CargoCarriage,` from the `Passenger,` and the `Driver.` Everything seems to pull each other. Everything seems to be connected, closed and tested. It turns out the code is small, everything is beautiful, and everything is clear. `Maintainability` at a high level. And if you program it through a service, I imagine how this code can be transferred to the service. It would become much mo challenging to read and not so compact. 
#### Use of lambdas, Stream API, interfaces.
If someone already knows `lambda` and `streams``, then write with `lambda` and with `streams.` You can use interfaces. We have already talked about interfaces. But interfaces may not be needed here. Because here, you can do everything on domain classes. And for domain classes, interfaces are usually not written.
