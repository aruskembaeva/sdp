# sdp
Character is the abstract class for all the other characters,while Weapon is an interface that all weapons implement. So all actual characters and weapons are concrete classes.
To switch weapons, each character calls the setWeapon() method, which is defi ned in the Character superclass. During a fight the useWeapon() method is called on the current weapon set for a given character to inflict great bodily damage on another character
