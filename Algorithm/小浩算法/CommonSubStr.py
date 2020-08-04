"""
两个数组的交集,考虑顺序问题所以先sort了一下,如果不sort则蜕变为最长公共子串问题
"""
num1 = [4, 4, 8]
num2 = [4, 2, 5, 4, 13]

print(num1)
print(num2)

small = 0
big = 0
common = []
num1.sort()
num2.sort()
for i in num2:
    if small < len(num1):
        if num1[small] == num2[big]:
            common.append(num2[big])
            big += 1
            small += 1
        else:
            big += 1
            small = 0

print(common)
