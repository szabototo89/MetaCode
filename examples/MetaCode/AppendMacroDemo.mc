implicit macro AppendMacro(tree: { * > * }) do
	foreach (var child : any in tree) do
		parent(child);
	end;
end;

skip;

if (true)
	skip;
end;


