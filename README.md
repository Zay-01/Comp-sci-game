# ToMerge 

-- Game -- 
Room
Enemy encounters
Hit box

-- Player --
Attack
Defense 
Health
Mana?
Actions (Heal, Fight, Defend, Spare(?))

-- Enemies --
Attack
Defense
Health
Mana Steal

-- Boss -- 
Attack
Defense
Health
Mana shield

VALUES
{
== ATTACK ==
Random number generated

== DEFENSE ==
Reduces % of attack 

== Health == 
Pre-Determined
Can be healed on your turn w/30 mana
If user no-hits turn they heal damage taken from last turn, if none were taken (Start of battle) heal player fully

== Mana ==
Allows user to attack/heal

User: maximum 200 mana
30 - Heal
1-10% Stolen from enemy at enemy turn

== Mana Shield ==
Pre-Determined, Heals up 20% of damage taken from last turn everytime user is hit 
(if user attack dealt 100 last turn, but user got hit 4 times by enemy, recover 40 shield hp (80%))
Shield will dissolve after 10 turns letting user hit boss

== Mana Steal ==
At start of enemy turn steal 1-10% of users mana 
Formula: MANA * {Number generated %}
}