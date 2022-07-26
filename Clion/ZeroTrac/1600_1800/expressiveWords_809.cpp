//
// Created by TzashiNorpu on 7/26/2022.
//
#include "header.h"

using namespace ZeroTrac;

bool check(string s, string w) {
    int n = s.size(), m = w.size(), i = 0, j = 0;
    for (int i2 = 0, j2 = 0; i < n && j < m; i = i2, j = j2) {
        if (s[i] != w[j]) return false;
        while (i2 < n && s[i2] == s[i]) i2++;
        while (j2 < m && w[j2] == w[j]) j2++;
        if (i2 - i != j2 - j && i2 - i < max(3, j2 - j)) return false;
    }
    return i == n && j == m;
}

int Solution::expressiveWords_809(string s, vector<string> &words) {
    int res = 0;
    for (auto &w: words) if (check(s, w)) res++;
    return res;
}