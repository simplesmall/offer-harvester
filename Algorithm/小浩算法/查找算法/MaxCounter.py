source = [1,2,4,5,5,3,7]


source.insert(1,1)
print(source)
for i in source:
    print(source[source.index(i)],i)