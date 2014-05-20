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
		// az equals ebben az esetben egy speciláis függvény,
		// ugyanis a name(...) egy listával tér vissza, és abban
		// keresi a 'name' sztringliterált 
		if (equals(name(member), 'name'))
			// az első paraméterrel mondjuk meg, hogy mit szeretnénk megváltoztatni
			// a másodikkal, hogy mely objektumnak akarjuk megváltoztatni
			// a harmadikkal pedig megmondjuk, hogy milyen típusú lesz
			change('type', type(member), 'string');
		end;
	end;
	debug(person);
end;

object Person 
  name: __missing__type__;
  age: number;
end;
