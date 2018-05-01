#!/bin/bash
for i in *.java; do
    j=`echo $i | sed 's/_1/_4/'`
    mv $i $j
done
