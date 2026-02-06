import os

old = "/home/biglinux/Downloads/file.txt"
new = "/home/biglinux/Downloads/new_file.txt"

if os.path.isfile(new):
    print("file already exists")
else:
    os.rename(old, new)

    
