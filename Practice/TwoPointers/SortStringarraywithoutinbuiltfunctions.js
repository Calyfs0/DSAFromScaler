let arr = ["car", "apple", "pets", "dog", "pet"]; //

let i = 0;
let j = 1;

isSwapped = true;

while (isSwapped) {
  for (let i = 0; i < arr.length - 1; i++) {
    isSwapped = false;
    let s1 = arr[i];
    let s2 = arr[i + 1];

    let c1 = s1.charAt(0);
    let c2 = s2.charAt(0);

    while (c1 == c2) {
      s1 = s1.substring(1);
      s2 = s2.substring(1);
      c1 = s1.charAt(0);
      c2 = s2.charAt(0);
    }

    if (s2.length == 0 && s1.length != 0) {
      let temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
      isSwapped = true;
    }

    if (s1.charCodeAt(0) > s2.charCodeAt(0)) {
      let temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
      isSwapped = true;
    }
  }
}

console.log(arr);
