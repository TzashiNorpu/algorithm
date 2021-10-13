import { isValidBST } from "../../Tree/isValidBST-098.js";
import assert from "assert";
import { TreeNode } from "../../Tree/TreeNode.js";
describe("isValidBST", function () {
  function makeTest(tree, res) {
    it(`[${JSON.stringify(tree)}]'s isValidBST result is ${JSON.stringify(
      res
    )}`, function () {
      assert.equal(JSON.stringify(isValidBST(tree)), JSON.stringify(res));
    });
  }
  let tree1 = new TreeNode(1);
  tree1.left = new TreeNode(2);
  tree1.right = new TreeNode(3);

  let tree2 = new TreeNode(2);
  tree2.left = new TreeNode(1);
  tree2.right = new TreeNode(3);

  let tree3 = new TreeNode(5);
  tree3.left = new TreeNode(1);
  tree3.right = new TreeNode(4);
  tree3.right.left = new TreeNode(3);
  tree3.right.right = new TreeNode(6);

  let res = [false, true, false];
  let trees = [tree1, tree2, tree3];
  for (let i = 0; i < trees.length; i++) {
    makeTest(trees[i], res[i]);
  }
});
