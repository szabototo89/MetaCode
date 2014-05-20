// az objektumtípusok közötti öröklődést fogjuk szimulálni a makróval
macro ExtendsMacro(trees: { * > type > attribute[name=extends] }) do
  foreach (var tree : any in trees) do
	  // mivel a szelektorral az attribútumot választottuk ki
	  // ezért vissza kell mennünk a szülő objektumhoz
	  var obj : any = parent(tree);
	  
	  // lekérjük az attribútum nulladik helyen lévő
	  var param : string = getAttributeValue(tree, 0);
	  
	  // mivel egy listával tér vissza a getAttributeValue, 
	  // ezért végig kell rajta iterálnunk
	  foreach (var objectName : string in param) do
	    debug(objectName);
	    // kiválasztjuk az ősobjektumokat
	    var selectedObjects : any = find(root(), '{ * > type[name=' + objectName + ']}');
	   
	    // hozzácsatoljuk az ősobjektum adattagjait az aktuálishoz
	    appendTo(members(selectedObjects), obj);
	  end;
	  
	  debug(param);
  end;
end;

// az 'ősosztályunk' lesz a Person
object Person 
  name: string;
  age: number;
end;

// az Employee a Person adattagjait fogja örökölni
@extends('Person')
object Employee
  job: string;
end;

// a Boss pedig az Employee adattagjait
@extends('Employee')
object Boss
  type: string;
end;




