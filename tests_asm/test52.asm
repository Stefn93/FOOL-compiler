push 0
push A
lhp
push 0
add
sw
push 2
lhp
push 1
add
sw
lhp
push 2
add
shp
lhp
lhp
push 0
add
sw
push C
lhp
push 1
add
sw
push 3
lhp
push 2
add
sw
lhp
push 3
add
shp
lhp
push B
lhp
push 0
add
sw
push 2
lhp
push 1
add
sw
lhp
push 2
add
shp
lhp
lhp
push 0
add
sw
push C
lhp
push 1
add
sw
push 3
lhp
push 2
add
sw
lhp
push 3
add
shp
lhp
lop
sro
push -2
lfp
add
lw
sop
lfp
lfp
push 0
smo
lop
push -2
add
lw
js
print
halt

ooo3C1:
cfp
lra
lop
sro
push -3
lop
add
lw
sop
lfp
lfp
push 0
smo
lop
push -2
add
lw
js
srv
sra
pop
sfp
lrv
lra
lro
sop
js

C:
lmo
push 0
beq ooo3C1

get3A1:
cfp
lra
push 44
srv
sra
pop
sfp
lrv
lra
lro
sop
js

A:
lmo
push 0
beq get3A1

get3B1:
cfp
lra
push 555
srv
sra
pop
sfp
lrv
lra
lro
sop
js

B:
lmo
push 0
beq get3B1
halt
