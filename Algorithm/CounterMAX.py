import time

source = [1, 2, 3, 5, 4, 3, 5, 2, 5, 6]
print(source)

# 方法一: 两层循环,将
beginMe1 = time.time()
counterMe1 = 0
temp_max = 0
val_max = 0
for i in source:
    temp_index = 0
    for j in source:
        time.sleep(0.01)
        counterMe1 +=1
        if i == j:
            temp_index += 1
    if temp_index > temp_max:
        temp_max = temp_index
        val_max = source[temp_max]

print(time.time()- beginMe1,counterMe1)
print(val_max, temp_max)

# 方法二: 先将各个数字以字典形式计数,再遍历字典查出次数最多的元素
beginMe2 = time.time()
counterMe2 = 0
dict = {}
temp = 0
for i in source:
    time.sleep(0.01)
    counterMe2 += 1
    """
    字典结构存储各个数据以及对应的出现次数
    """
    if dict.__contains__(i):
        dict[i]  +=  1
    else:
        dict[i] = 1

counter = 0
max_val = 0
for i in dict:
    time.sleep(0.01)
    counterMe2 += 1
    if dict[i]>counter:
        counter = dict[i]
        max_val = i

print(time.time()-beginMe2,counterMe2)
print(max_val,counter)
print(dict)


