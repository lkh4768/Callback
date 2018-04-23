#!/bin/bash

for i in $(seq 1 20000)
do
	filenames="$filenames $i"
done

touch $filenames
