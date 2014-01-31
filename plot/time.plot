set logscale x
set logscale y
plot "Timeplot.dat" using 1:2 title "s1", "Timeplot.dat" using 1:6 title "s5", "Timeplot.dat" using 1:7 title "s6", "Timeplot.dat" using 1:9 title "s8", "Timeplot.dat" using 1:10 title "s9"

