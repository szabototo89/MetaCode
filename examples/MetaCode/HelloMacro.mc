implicit macro DebugMacro(tree: { * > * }) do
	var i : number = 1;
	foreach (var child : any in convertToString(tree)) do
		debug(i + '. child');
		debug(child);
	end;
end;

skip;

if (true)
	skip;
end;