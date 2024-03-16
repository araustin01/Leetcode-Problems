function lengthOfLongestSubstring(s: string): number {
    var sub: string = ""; // current sub
    var lsub: string = sub; // largest sub
    
    for(let i = 0; i < s.length; i++) {
        console.log(`sub=${sub} // lsub=${lsub}`);
        let c: string = s.charAt(i);
        let index: number = c.charCodeAt(0) - 'a'.charCodeAt(0); // character encoding (a-z => 0-25)
        sub = sub.substring(sub.indexOf(c)+1) + c
        if(sub.length > lsub.length)
            lsub = sub;
    }
    return lsub.length;
};
