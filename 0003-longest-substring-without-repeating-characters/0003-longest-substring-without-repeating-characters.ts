function lengthOfLongestSubstring(s: string): number {
    var sub: string = ""; // current sub
    var lsub: string = sub; // largest sub
    
    for(let i = 0; i < s.length; i++) {
        let c: string = s.charAt(i);
        sub = sub.substring(sub.indexOf(c)+1) + c // shift string appropriately 
        if(sub.length > lsub.length)
            lsub = sub; // track largest consecutive string
    }
    return lsub.length;
};
