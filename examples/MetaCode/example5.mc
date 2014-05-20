macro ObjectType(person: { * > type[name=Person] }) do
	// kiíratjuk a konzolra az adattagok nevét
	// a name függvény az adattagok nevével tér vissza
	// ebben az esetben name(members(person)) == [ 'name', 'age' ]-el egyenlő
	foreach (var m: string in name(members(person))) do
		debug(m);
	end;
	
	// a members a típus adattagjaival tér vissza
	foreach (var member : any in members(person)) do
		// a name adattag típusát megváltoztatjuk any-ra
		// a change függvénnyel
		if (equals(name(member), 'name'))
			// az első paraméterrel mondjuk meg, hogy mit szeretnénk megváltoztatni
			// a másodikkal, hogy mely objektumnak akarjuk megváltoztatni
			// a harmadikkal pedig megmondjuk, hogy milyen típusú lesz
			change('type', type(member), 'any');
		end;
	end;
	debug(person);
end;

object Person 
  name: string;
  age: number;
end;

@extends(Person)
object Employee
  company: string;
end;








