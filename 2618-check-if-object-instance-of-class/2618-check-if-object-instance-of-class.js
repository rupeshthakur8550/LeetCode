/**
 * @param {*} obj
 * @param {*} classFunction
 * @return {boolean}
 */

var checkIfInstanceOf = function(obj, classFunction) {
    if(obj === null || obj === undefined || typeof classFunction !== 'function') {
        return false;
    } else {
        let currProto = Object.getPrototypeOf(obj)
        while (currProto !== null) {
            if(currProto === classFunction.prototype) {
                return true;
            }
            currProto = Object.getPrototypeOf(currProto);
        }
        return false;
    }
};

/**
 * checkIfInstanceOf(new Date(), Date); // true
 */