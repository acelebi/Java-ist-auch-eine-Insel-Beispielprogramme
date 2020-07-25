var f = new javax.swing.JFrame()
f.setSize( 500, 100 )
f.defaultCloseOperation = javax.swing.JFrame.EXIT_ON_CLOSE
f.title = "Hallo " + name + "."
f.visible = true
var today = java.time.LocalDate.now()
print( today )
var month = today.getMonth()
