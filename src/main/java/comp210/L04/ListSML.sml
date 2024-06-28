(* 
Put code into online SML editor
https://sosml.org/editor
*)

(*
LIST of E

new     :                   --> LIST
ins     : LIST x E x int    --> LIST
rem     : LIST x int        --> LIST
get     : LIST x int        --> E
find    : LIST x E          --> int
size    : LIST              --> int
empty   : LIST              --> boolean
*)

datatype ('e) LIST = New
    | ins of ('e LIST) * 'e * int;

exception ERR;

fun rem(New, _) = raise ERR
    | rem(ins(L, e, i), j) = if i = j then L
                             else if j < i then ins(rem(L, j), e, i-1)
                             else ins(rem(L, j-1), e, i);

fun get(New, _) = raise ERR
    | get(ins(L, e, i), j) = if i = j then e
                             else if j < i then get(L, j)
                             else get(L, j-1);

(* -1 represented as ~1 *)
fun find(New, _) = ~1
    | find(ins(L, e1, i), e2) = if e1 = e2 then i
                                else find(L, e2);

fun size(New) = 0
    | size(ins(L, e, i)) = size(L) + 1;

fun empty(New) = true
    | empty(ins(L, e, i)) = false;

(*---------------------------------------*)
(*   test data points                    *)
(*---------------------------------------*)

val l = New;
val l1 = ins(l, 1, 0); (* [1] *)
val l2 = ins(l1, 3, 1); (* [1, 3] *)
val l3 = ins(l2, 2, 1); (* [1, 2, 3] *)
val l4 = rem(l3, 1); (* [1, 3] *)
val l5 = rem(l4, 0); (* [3] *)
val l6 = ins(l5, 2, 0); (* [2, 3] *)
val l7 = rem(l6, 0); (* [3] *)
val l8 = rem(l7, 0); (* [] *)

(*---------------------------------------*)
(*   test cases                          *)
(*---------------------------------------*)

get(l1, 0)=1;
get(l3, 2)=3;
get(l6, 0)=2;

find(l, 1)= ~1;
find(l3, 4)= ~1;
find(l3, 3)=2;

size(l)=0;
size(l1)=1;
size(l2)=2;
size(l3)=3;
size(l4)=2;
size(l5)=1;
size(l6)=2;

empty(l)=true;
empty(l1)=false;
empty(l2)=false;
empty(l3)=false;
empty(l4)=false;
empty(l5)=false;
empty(l6)=false;
empty(l7)=false;
empty(l8)=true;
