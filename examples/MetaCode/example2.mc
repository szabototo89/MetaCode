macro AddValueMemberToPerson(person: { * > type[name=Person] }) do
	// új adattagot (value: any) adunk a típushoz 
	appendTo([ formalParameter('value', 'any') ], person);
end;

// a Person típushoz konkatenáljuk
object Person 
  name: string;
  age: number;
end;

// itt példányosítjuk a Person típust
var p : Person = new(Person);

p.name = 'Gipsz Jakab';

debug(p.name);
