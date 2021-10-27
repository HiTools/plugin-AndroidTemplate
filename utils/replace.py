#!/usr/local/bin/python3
# -*- coding: UTF-8 -*-

import os
import sys


file1 = open("input.txt")
file2 = open("output.txt","w")

while True:
    line = file1.readline()
    line = line.replace("\n", "&#10;")
    line = line.replace("<", "&lt;")
    line = line.replace(">", "&gt;")
    line = line.replace('"', "&quot;")

    file2.write(line)
    file2.write("\n")
    if not line:
        break

file1.close()
file2.close()
