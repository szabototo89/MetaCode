// ezzel a makróval készítünk egy új függvényt
macro CreateFunction(tree : { * }) do
	var func: any = func(
		'max', [ parameter('a', 'number'), parameter('b', 'number') ],
		ast('if (a > b) result = a; else result = b; end;')
	);
	
	// a prependTo-val a kód elejére szúrjuk be az általunk
	// összeállított függvényt
	prependTo(func, tree);
end;

// A LogBranchesMacro kiválasztja a globális hatókörben lévő
// elágazosok igaz ágát választjuk ki
macro LogBranchesMacro(tree: { * > if[true-statement] }) do
	// hozzácsatoljuk a debug függvényhívást a szekvencia végéhez
	appendTo(
		functionCall('debug', [str('Elágazás vége ...')]), tree
	);
	// hozzácsatoljuk a debug függvényhívást a szekvencia elejéhez
	prependTo(
		// a függvényhívást a functionCall függvénnyel állítjuk elő
		// ez automatikusan visszatér annak a szintaxisfájával
		// első paraméterként átadjuk neki a függvény nevét
		// míg másodikként az aktuális paramétereket		
		functionCall('debug', [str('Elágazás kezdete ...')]), tree
	);
end;  

// A DetachBranchesInWhileBody makróval lekérdezzük a while ciklus törzsét
macro DetachBranchesInWhileBody(tree : { * > while[body] }) do
	// töröljük a benne lévő elágazásokat
	detach(find(tree, '{ * > if }'));
	
	prependTo(
		functionCall('debug', [str('Ciklus törzsének kezdete ...')]), tree
	);
	
	// és hozzácsatolunk egy függvényhívást
	appendTo(
		functionCall('debug', [str('Ciklus törzsének vége ...')]), tree
	);
end;


if (true)
	if (2 >= 0)
		debug('Hello World');	
	end;
end;

var i : number = 1;

while (i < 4) do
	if (true)
		if (false)
			skip;
		end;
	end;
	debug(max(10, 13));
	if (false)
		skip;
	end;
	i = i + 1;
end;













