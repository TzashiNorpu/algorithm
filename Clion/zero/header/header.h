//
// Created by TzashiNorpu on 5/31/2023.
//

#ifndef CLION_HEADER_H
#define CLION_HEADER_H
using namespace std;

#include "string"
#include "algorithm"
#include "unordered_set"
#include "unordered_map"
#include "numeric"
#include "deque"

namespace zero {
    class CustomFunction {
         public:
            // Returns f(x, y) for any given positive integers x and y.
             // Note that f(x, y) is increasing with respect to both x and y.
             // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
            int f(int x, int y);
        };
     struct TreeNode {
             int val;
             TreeNode *left;
             TreeNode *right;
             TreeNode() : val(0), left(nullptr), right(nullptr) {}
             TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
             TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
         };
    class Solution {
    public:
        string reversePrefix(string word, char ch);

        int countOperations(int num1, int num2);

        int dayOfYear(string date);

        int numUniqueEmails(vector<string> &emails);

        long long waysToBuyPensPencils(int total, int cost1, int cost2);

        int longestStrChain(vector<string> &words);

        int countSeniors(vector<string> &details);

        vector<vector<int>> minimumAbsDifference(vector<int> &arr);

        vector<int> sumEvenAfterQueries(vector<int> &nums, vector<vector<int>> &queries);

        int maximumCount(vector<int> &nums);

        bool uniqueOccurrences(vector<int> &arr);

        int maximum69Number(int num);

        bool kLengthApart(vector<int> &nums, int k);

        string gcdOfStrings(string str1, string str2);

        int rotatedDigits(int n);

        int numSteps(string s);

        bool checkXMatrix(vector<vector<int>> &grid);

        double average(vector<int> &salary);

        int findJudge(int n, vector<vector<int>> &trust);

        bool checkString(string s);

        int countElements(vector<int> &nums);

        int arithmeticTriplets(vector<int> &nums, int diff);

        int numberOfMatches(int n);

        bool isThree(int n);

        bool checkZeroOnes(string s);

        int countCharacters(vector<string> &words, string chars);

        vector<int> leftRightDifference(vector<int> &nums);

        int rangeSum(vector<int> &nums, int n, int left, int right);

        int countStudents(vector<int> &students, vector<int> &sandwiches);
        vector<vector<int>> findSolution(CustomFunction& customfunction, int z);

        int pseudoPalindromicPaths (TreeNode* root);
    };
}

#endif //CLION_HEADER_H
