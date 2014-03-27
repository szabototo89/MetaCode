
$(function() {
    $("#show").on("click", function() {
        var $canvas = $("#canvas")
        $canvas.empty();

        var dot = $("#editor").val();

        var container = document.getElementById('canvas');

        var options = {
            hierarchicalLayout: {
              nodeSpacing: 1000,
              direction: "LR",
            levelSeparation: 150,
            }
        };

        var graph = new vis.Graph(container, { dot: dot }, options);
    })
});