import java.util.Scanner;

public class HauntedHouse {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        int actions;

        System.out.println("A cloaked figure has just taken your little sister into a decrepit old house. Are you going to scout the area first or immediately chase after her? Type 1 to CHASE or 2 to SCOUT.");

        do {
            System.out.print("Enter your choice: ");
            actions = scanInput.nextInt();
        }
        while ((actions != 1) && (actions != 2));
        if (actions == 1) {
            System.out.println("You decide to chase after your sister, bursting through the house's heavy front door. Footsteps can be heard in the room on your left, which looks to be a kitchen.");
            System.out.println("After running into the kitchen, you spot a zombie shuffling around. Your little sister starts screaming like a banshee, attracting its attention. It makes its way towards her.");
            System.out.println("You spot a dining room on the other side of the kitchen. Are you going to abandon your little sister or inspect the kitchen to help? Type 1 to ABANDON or 2 to INSPECT.");

            do {
                System.out.print("Enter your choice: ");
                actions = scanInput.nextInt();
            }
            while ((actions != 1) && (actions != 2));
            if (actions == 1) {
                System.out.println("You decided to run away, leaving your poor little sister behind with the zombie.");
                System.out.println("You hear the sounds of her screaming get louder as you dash into the next room. After taking a moment to recompose yourself, you notice that the screaming has stopped.");
                System.out.println("Before you get a chance to check, a sudden thump is heard at the dining room's back door. The door shakes more violently each pulsing thump as something green oozes out the door's frame.");
                System.out.println("A foul stench pours into the room as the door slams down, revealing a wall of green slime leading to the outside. Do you stick your hand in or escape to where you came from?");
                System.out.println("Type 1 to ESCAPE THE HOUSE or 2 to STICK YOUR HAND IN THE SLIME.");

                do {
                    System.out.print("Enter your choice: ");
                    actions = scanInput.nextInt();
                }
                while ((actions != 1) && (actions != 2));
                if (actions == 2) {
                    System.out.println("You stuck your hand into the wall of stinky slime.");
                    System.out.println("Nothing interesting happens--just kidding, you got sucked into the slime almost immediately. You are now slowly suffocating. It starts to move outside the house, carrying you within it.");
                    System.out.println("Fortunately for you, it travels over open cellar doors, dropping you into it. You can breathe again. However, there seems to be no way to get back out.");
                    System.out.println("The rest of the cellar is pitch dark, except for a faint candlelit room in the distance, down a hallway. Do you go towards it or stay in your current spot? Type 1 to GO or 2 to STAY.");

                    do {
                        System.out.print("Enter your choice: ");
                        actions = scanInput.nextInt();
                    }
                    while ((actions != 1) && (actions != 2));
                    if (actions == 1) {
                        System.out.println("You made it through the hallway without harm and arrive into a small ritualistic room, candles unwavering.");
                        System.out.println("There is a sharp glowing red stone resting on top of the table in the middle of the room. You pick it up and head back through the hallway. It gives off a faint light in the darkness.");
                        System.out.println("Using the stone, you find the stairs leading up into the house. The door doesn't budge when you turn the doorknob. Shoulder bash the door or jam the stone into the door's keyhole?");
                        System.out.println("Type 1 to SHOULDER BASH or 2 to USE THE STONE.");

                        do {
                            System.out.print("Enter your choice: ");
                            actions = scanInput.nextInt();
                        }
                        while ((actions != 1) && (actions != 2));
                        if (actions == 1) {
                            System.out.println("The door doesn't budge from your shoulder bash. Instead, something on the other side of the door retaliates, slamming against the door. It breaks the door down.");
                            System.out.println("You run back down the stairs into the cellar. Clasping the sharp glowing red stone in your hand, you prepare for what's about to come.");
                            System.out.println("The red stone glows brighter as whatever makes its way down the stairs. You see that it's a familiarly cloaked figure--the same cloak you saw that took your sister to this place.");
                            System.out.println("However, the cloaked figure faces you, and pulls back its hood. It's your sister, but her skin is pale and her eyes are pitch black. She coughs and opens her mouth, expelling a black mist.");
                            System.out.println("The red stone in your hand starts vibrating violently, as if it needs to plunge itself into the being before it. Do you? Type 1 to SPARE or 2 to KILL.");

                            do {
                                System.out.print("Enter your choice: ");
                                actions = scanInput.nextInt();
                            }
                            while ((actions != 1) && (actions != 2));
                            if (actions == 2) {
                                System.out.println("You allow the stone to guide your hand forward, propelling deeply into the being's head. The spirit screams.");
                                System.out.println("The eerie feeling of the house lifts, and you hear a doors burst open. The sound echoes down the cellar stairway. You run up the stairs, seeing the front door wide open.");
                                System.out.println("It's too late. Your sister was consumed the by the spirits of the house. However, you put a stop to it. [END]");
                            } else {
                                System.out.println("The being before you smiles eerily. She tells you that you're strong for controlling the stone, and asks you to join her. She holds out her hand, as if for you to take it.");
                                System.out.println("You take her hand and hug what remains of your sister. However, you start to feel strange...");
                                System.out.println("This house is your home now. There's no going back. [END]");
                            }
                        } else {
                            System.out.println("Bad idea. The stone breaks against the door in a flash of light. You hear its shattered pieces fall down the stairs. Immediately, a gust of wind hits you from where the door was.");
                            System.out.println("It gets colder in the stairway. Reaching out to the door, you feel nothing. The shadows surround you and your mind succumbs to the spirits of the house. You can not continue. [END]");
                        }
                    } else {
                        System.out.println("The vision of the candlelit room fades into darkness. The shadows surround you and your mind succumbs to the spirits of the house. You can not continue. [END]");
                    }
                } else {
                    System.out.println("With no sign of the zombie or your sister, you return the front door. You hear a laugh from above.");
                    System.out.println("Looking upwards, you see a familiar cloaked figure peering at you from behind the 2nd floor railings.");
                    System.out.println("It vanishes as soon as you blink, leaving you with the afterimage of a disturbing grin. You made it out alive... but at what cost? You'll never see your little sister again.");
                    System.out.println("How could you leave her behind? [END]");
                }
            } else {
                System.out.println("You find a knife and take down the zombie. Your little sister hugs you and cries. You two immediately make a beeline for the door, never to set foot in the place again.");
                System.out.println("That night, you call the police on the house. An hour later, they tell you that you gave them the wrong address, as there was no house there, just grass. [END]");
            }
        } else {
            System.out.println("You decide to check the area out, in case heading into the front door was not a good idea.");
            System.out.println("After making your way to the back of the house, you see an open back door. Footsteps can be heard behind you. Do you run into the house or turn around?");
            System.out.println("Type 1 to TURN AROUND or 2 to RUN INTO THE HOUSE.");

            do {
                System.out.print("Enter your choice: ");
                actions = scanInput.nextInt();
            }
            while ((actions != 1) && (actions != 2));
            if (actions == 2) {
                System.out.println("You run into the house, barely shutting the door behind you as a cleaver flies past your head. Close call!");
                System.out.println("A cacophony of screams, stomps, and laughter is heard from upstairs. Determined to find your little sister, you work up the courage.");
                System.out.println("As you walk up the stairs, you could've sworn you saw the eyes on the paintings move. You feel a hand on your shoulder and flinch, looking back.");
                System.out.println("Nothing's there. You continue up the stairs and find that there are four rooms. Two are locked shut.");
                System.out.println("Go into the left room, or right room? Type 1 for LEFT or 2 for RIGHT.");

                do {
                    System.out.print("Enter your choice: ");
                    actions = scanInput.nextInt();
                }
                while ((actions != 1) && (actions != 2));
                if (actions == 1) {
                    System.out.println("It's a master bedroom that is surprisingly mostly intact. There are lots of valuable things lying around, despite it being dusty. Looks like someone lived comfortably.");
                    System.out.println("Plenty of drawers, wardrobes, and chests in this large bedroom are free to open. Type 1 for CHESTS or 2 for WARDROBES & DRAWERS.");

                    do {
                        System.out.print("Enter your choice: ");
                        actions = scanInput.nextInt();
                    }
                    while ((actions != 1) && (actions != 2));
                    if (actions == 1) {
                        System.out.println("One particular chest catches your eye, as there is a faint white glow peeking its rays from between the hinges. You open the chest and obtain a magic sword, and a key!");
                        System.out.println("You turn back to the hallway and decide that the key must be for one of the doors. However, the key is rusted to the point where it looks like it could break in one use.");
                        System.out.println("Which door should you try? Type 1 for DOOR A or 2 for DOOR B.");

                        do {
                            System.out.print("Enter your choice: ");
                            actions = scanInput.nextInt();
                        }
                        while ((actions != 1) && (actions != 2));
                        if (actions == 1) {
                            System.out.println("The key breaks and the door opens successfully! You peek into the dark room, a horrid smell attacking your nostrils. Dried blood on rags were strewn all across the room.");
                            System.out.println("With the moonlight as your only light source, you try to make out what seems to be a tall, disturbing figure standing in the middle of the room.");
                            System.out.println("As you squint your eyes, you hear your little sister's voice from within the ragged figure, asking if you were there.");
                            System.out.println("The figure turns around, displaying its rotten flesh, grisly teeth and torn shawl. It hisses. You clench your magic sword and point it towards the wraith.");
                            System.out.println("Do you charge in or wait for the wraith to attack? Type 1 to CHARGE or 2 to WAIT.");

                            do {
                                System.out.print("Enter your choice: ");
                                actions = scanInput.nextInt();
                            }
                            while ((actions != 1) && (actions != 2));
                            if (actions == 2) {
                                System.out.println("Despite the horrible smell, you take a deep breath and keep your cool. You eye the wraith. It flies towards you with a burst of speed that felt instant.");
                                System.out.println("You swing your sword by instinct, managing to drive the gleaming blade straight through the entity. Its inhuman scream echoes throughout the house, at a volume that's almost deafening.");
                                System.out.println("You hear your sister cry from the corner of the room amidst the screams. You run straight for your sister and grab her hand, leading her out of the room, down the stairs, and out the house.");
                                System.out.println("The next day, you two receive a mysterious letter dated from 300 years back. It thanks you for releasing them from suffering any longer. [END]");
                            } else {
                                System.out.println("The wraith sneers and tosses your little sister's body in front of it as a shield. Startled, you stumble back with your sister's corpse and fall victim to the wraith as well. [END]");
                            }
                        } else {
                            System.out.println("The key breaks and the door doesn't open. Guess you're stuck in this house now.");
                            System.out.println("The shadows surround you and your mind succumbs to the spirits of the house. You can not continue. [END]");
                        }
                    } else {
                        System.out.println("You opened the wrong wardrobe. A zombie came out for an early snack. [END]");
                    }
                } else {
                    System.out.println("You enter a large study. As you look around, a pendant on the desk catches your eye. Take it? Type 1 to TAKE or 2 to LEAVE IT.");

                    do {
                        System.out.print("Enter your choice: ");
                        actions = scanInput.nextInt();
                    }
                    while ((actions != 1) && (actions != 2));
                    if (actions == 2) {
                        System.out.println("You left the pendant alone. It whispers and shakes. The door shuts behind you, leaving you in pitch darkness.");
                        System.out.println("The shadows surround you and your mind succumbs to the spirits of the house. You can not continue. [END]");
                    } else {
                        System.out.println("You took the pendant, allowing a ghost to possess you. [END]");
                    }
                }
            } else {
                System.out.println("A hefty person with a bloody apron has come to greet you... with their cleavers. You did not survive. [END]");
            }
        }
    }
}
