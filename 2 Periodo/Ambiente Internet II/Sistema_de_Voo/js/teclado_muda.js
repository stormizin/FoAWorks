var campo = 'passwd'; //nome do campo que receberá os caracteres do teclado. Normalmente um campo input type="password"
function init() {
sorteio();
var teclas = $('teclas').getElementsByTagName('a'); //pego todos os elementos link dentro do div teclas
var i;
for (i = 0; i < teclas.length; i++) {
  var click = function(v) {
   $(campo).value += teclas[v].firstChild.data; //passo o valor do link para o campo do formulário
   sorteio();
  };
  addEvent(teclas[i], "click", click.bind(this, i)); //atribuo o evento onclick dos links
  addEvent(teclas[i], "mouseover", esconde); //atribuo o evento onmouseover dos links, fazendo com que os números desapareçam
  addEvent(teclas[i], "mouseout", mostra); //atribuo o evento onmouseout dos links, fazendo com que os números reapareçam
}
}
function sorteio() {
var sort = Math.random(); //sort recebe um número entre 0 e 1, sorteado randomicamente. Isso faz a cada reload os números aparecerem numa ordem
if ((sort >= 0) && (sort < 0.1)) { //de acordo com o valor de sort, atribuo um inteiro a ele
  sort = 0;
} else if ((sort >= 0.1) && (sort < 0.2)) {
  sort = 1;
} else if ((sort >= 0.2) && (sort < 0.3)) {
  sort = 2;
} else if ((sort >= 0.3) && (sort < 0.4)) {
  sort = 3;
} else if ((sort >= 0.4) && (sort < 0.5)) {
  sort = 4;
} else if ((sort >= 0.5) && (sort < 0.6)) {
  sort = 5;
} else if ((sort >= 0.6) && (sort < 0.7)) {
  sort = 6;
} else if ((sort >= 0.7) && (sort < 0.8)) {
  sort = 7;
} else if ((sort >= 0.8) && (sort < 0.9)) {
  sort = 8;
} else {
  sort = 9;
}
var teclas = $('teclas').getElementsByTagName('a'); //pego todos os elementos link dentro do div teclas
var i;
for (i = 0; i < teclas.length; i++) {
  teclas[i].firstChild.data = sort; //atribuo ao link o valor sorteado
  sort++;
  sort = (sort > 9) ? 0 : sort;
}
}
function esconde() {
var teclas = $('teclas').getElementsByTagName('a');
var i;
for (i = 0; i < teclas.length; i++) {
  teclas[i].className = 'esconde';
}
}
function mostra() {
var teclas = $('teclas').getElementsByTagName('a');
var i;
for (i = 0; i < teclas.length; i++) {
  teclas[i].className = 'mostra';
}
}
//Trecho de código criado por Wilker, pego em [url="http://forum.imasters.com.br/index.php?s=&showtopic=198704&view=findpost&p=660522"]http://forum.imasters.com.br/index.php?s=&showtopic=198704&view=findpost&p=660522[/url]
function $(e) {
return document.getElementById(e);
}
var $A = Array.from = function(iterable) {
if (!iterable) return [];
if (iterable.toArray) {
  return iterable.toArray();
} else {
  var results = [];
  for (var i = 0; i < iterable.length; i++)
   results.push(iterable[i]);
  return results;
}
};
Function.prototype.bind = function() {
var __method = this, args = $A(arguments), object = args.shift();
return function() {
  return __method.apply(object, args.concat($A(arguments)));
};
};
//Fim do trecho de código criado por Wilker
function addEvent(obj, evType, fn) { //Função adaptada da original de Christian Heilmann, em [url="http://www.onlinetools.org/articles/unobtrusivejavascript/chapter4.html"]http://www.onlinetools.org/articles/unobtrusivejavascript/chapter4.html[/url]
if (typeof obj == "string") {
  if (null == (obj = document.getElementById(obj))) {
   throw new Error("Elemento HTML não encontrado. Não foi possível adicionar o evento.");
  }
}
if (obj.attachEvent) {
  return obj.attachEvent(("on" + evType), fn);
} else if (obj.addEventListener) {
  return obj.addEventListener(evType, fn, true);
} else {
  throw new Error("Seu browser não suporta adição de eventos.");
}
}
addEvent(window, 'load', init); //adiciono a função init ao evento onload da página