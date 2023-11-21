const str = "This is a sunny day";
const words = str.split(' ');
for(let i = 0; i < words.length; i++){
    let word = words[i];
    let tempword = "";
    for(let j = word.length - 1; j >= 0; j--){
        tempword = tempword + word[j];
    }
    words[i] = tempword;
    
}
const reversedStr = words.join(' ');
console.log(reversedStr);