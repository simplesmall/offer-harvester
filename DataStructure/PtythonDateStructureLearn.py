# 列表：list = [val1, val2, val3, val4]，用中括号；
list = [1, 2, 3, 4, 'String', {'key': 'Hello'}]
print(list)
# ######################### 增 #####################
# append 在末尾添加
list.append('last append')
print(list)
# insert 在指定的地方添加,注意,添加的位置是指定数字下标的前面,下标从0~length-1
list.insert(1, 'insert demo')
print(list)
# 给下标2的位置元素赋值
list[2:2] = [110, 111, 112, {122, 123}]
print(list)
ex_list = ['dark', 'black', 'gray']
# extend 添加多个元素,默认添加在末尾
list.extend(ex_list)
print(list)
print('############')
# ######################### 删 #####################
# 指定删除元素
list.remove('insert demo')
print(list)
del list[8:len(list) - 3]
print(list)
print('############')
# ######################### 改 #####################
list[0] = '修改后的值'
print(list)
print('############')
# 查看某个元素的位置 如果不存在会报错
print(list.index(112))
print('############TURPLE')

# 元组：tuple = (val1, val2, val3, val4)，用小括号；元组不可修改，类似于稳定版的列表
turple = (123,234,345)
print(turple)
# 可以按照下标取值以及根据值取得下标
print(turple[1])
print(turple.index(345))
print('############DICT')
# 字典：dict = {key1: val1, key2: val2, key3: val3}，用大括号；
# 字典中的元素必须时键值对的形式；
# 键(key)不可以重复，而值(value)可以重复；
# 键不可变，无法修改；值可以修改，可以是任何对象
dict = {'k1':123,'k2':'V2'}
print(dict)
#  增
dict['k3'] = 'Same as append in list'
print(dict)
# update 等同与list中的insert 可以添加多个元素
addDict = {'ad1':'Apple','ad2':[3,5,8,13,21,{'animal':'alphant'}]}
dict.update(addDict)
print(dict)
# 删  字典虽然使用的是大括号{},但是删除的时候使用中括号[]
del dict['k2']
print(dict)
# 改 直接将key对应的val赋值就可以
dict['k1'] = '修改后的字典value'
print(dict)
print('############SET')

# 集合：set = {val1, val2, val3, val4}，
# 用大括号；每个集合中的元素时无序的、不重复的任何Python对象，我们可以通过集合去判断数据的从属关系，有时还可以通过集合把数据结构中重复的元素过滤掉。集合不可以被切片也不能被索引，除了做集合运算外，集合元素可以被添加和删除
set = {'s1','s2','s3'}
print(set)
set.add('AddedS3')
print(set)
set.add('monkey')
print(set)
