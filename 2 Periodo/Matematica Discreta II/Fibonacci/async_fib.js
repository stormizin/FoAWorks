/*

Cálculo assíncrono supermega fast com javascript no Node.JS
por @_rchaves_

*/

var fibonacci = function(n, callback) {
    var inner = function(n1, n2, i) {
        if (i > n) {
            callback(n2);
            return;
        }
        var func = (i % 100) ? inner : inner_tick;
        func(n2, n1 + n2, i + 1);
    }
    var inner_tick = function(n1, n2, i) {
        process.nextTick(function() { inner(n1, n2, i); });
    }
    if (n == 1 || n == 2) {
        callback(1);
    } else {
        inner(1, 1, 3);
    }
}

fibonacci(40, function(n){
	console.log(n);
});
fibonacci(40, function(n){
	console.log(n);
});