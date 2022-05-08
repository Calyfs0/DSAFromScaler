function IntersectionOfTwoArrays(nums1, nums2) {
  if (nums1.length < nums2.length) {
    return IntersectionOfArrays(nums1, nums2);
  } else {
    return IntersectionOfArrays(nums2, nums1);
  }

  function IntersectionOfArrays(arr1, arr2) {
    let hm = {};
    let output = [];
    for (let i = 0; i < arr1.length; i++) {
      if (hm[arr1[i]] == null) {
        hm[arr1[i]] = 1;
      } else {
        hm[arr1[i]] = hm[arr1[i]] + 1;
      }
    }

    for (let i = 0; i < arr2.length; i++) {
      if (hm[arr2[i]] != null && hm[arr2[i]] > 0) {
        output.push(arr2[i]);
        hm[arr2[i]] = hm[arr2[i]] - 1;
      }
    }

    return output;
  }
}

nums1 = [1, 2, 2, 1];
nums2 = [2, 2];

console.log(IntersectionOfTwoArrays(nums1, nums2));
