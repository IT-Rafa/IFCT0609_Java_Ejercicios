@echo off

printf "\nRESULTADOS OK\n"
printf "\n---- app\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar"
printf "\n---- app -gui\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -gui
printf "\n---- app -e 1 -g 2\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -e 1 -g 2
printf "\n---- app -GUI -e 1 -g 2\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -GUI -e 3 -g 3

printf "\nRESULTADOS KO\n"
printf "\n---- app -CL -e 1 -g 2\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -CL -e 1 -g 2
printf "\n---- app -cli -e 1 -g\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -GUI -e 1 -g
printf "\n---- app -GUI -e 1 -g 3 -GUI\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -GUI -e 1 -g 3 -cli
printf "\n---- app -e -GUI -g 2\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -e -GUI -g 2
printf "\n---- app -GUI -gui\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -GUI -gui
printf "\n---- app -GUI -e 2\n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -GUI -e 2
printf "\n---- app --ejercicio 2 --grupo 5 \n"
java -jar ./dist/"IFCT0609EjerciciosJava.jar" -GUI --ejercicio 2 --grupo 5