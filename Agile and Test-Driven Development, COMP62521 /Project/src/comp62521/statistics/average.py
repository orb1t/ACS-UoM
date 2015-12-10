def mean(X):
    n = len(X)
    if n > 0:
        return float(sum(X)) / float(len(X))
    return 0


def median(X):
    n = len(X)
    if n == 0:
        return 0
    L = sorted(X)
    if n % 2:
        return L[n / 2]
    return mean(L[(n / 2) - 1:(n / 2) + 1])


def mode(X):
    n = len(X)
    if n == 0:
        return []

    d = {}
    for item in X:
        if d.has_key(item):
            d[item] += 1
        else:
            d[item] = 1

    # fix the trouble when there is more then one number in mode.
    m = ([], 0)
    for key in d.keys():
        if d[key] > m[1]:
            m = ([key], d[key])
        elif d[key] == m[1]:
            m[0].append(key)

    return m[0]

