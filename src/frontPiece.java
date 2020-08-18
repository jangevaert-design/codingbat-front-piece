public class frontPiece {
  public int[] frontPiece(int[] nums) {

    if (nums.length < 2) {
      return nums;
    } else {
      int[] a = {nums[0], nums[1]};
      return a;
    }
  }
}
