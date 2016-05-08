(ns gigrig.data)

(defonce data
  [
   {:brand "Aguilar" :model "Tonehammer" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Aguilar" :model "Agro" :distributor true :isolator true :other false}
   {:brand "Boss" :model "older ACA pedals (G'n' Fly" :distributor false :isolator true :other false}
   {:brand "Boss" :model "DD-20 Giga Delay" :distributor false :isolator true :other false}
   {:brand "Boss" :model "RE-20 Space Echo" :distributor false :isolator true :other false}
   {:brand "D*A*M" :model "Ezekiel 25:17" :distributor false :isolator true :other false}
   {:brand "D*A*M" :model "Meat Head" :distributor true :isolator true :other false}
   {:brand "D*A*M" :model "MKII" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "D*A*M" :model "Ram Head" :distributor true :isolator true :other false}
   {:brand "D*A*M" :model "Red Rooster" :distributor true :isolator true :other false}
   {:brand "D*A*M" :model "Sonic Titan" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "60's Series Back Talk" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "60's Series Psycho Flange" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Black Paisley Liquid Metal" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Blue Paisley Pure Drive" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Cool Cat Chorus" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Danelectro" :model "Cool Cat Drive (and V2)" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Cool Cat Fuzz (and V2)" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Cool Cat Metal" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Cool Cat Metal II" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Cool Cat Transparent Overdrive (and V2)" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Cool Cat Tremolo" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Cool Cat Vibe" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "FAB Chorus" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "FAB Delay" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "FAB Distortion" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "FAB Echo" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "FAB Flange" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "FAB Flange" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "FAB Fuzz" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "FAB Metal" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "FAB Overdrive" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Free Speech Talk Box" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "J Drive MK3" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Black Coffee Metal Distortion" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Black Licorice Beyond Metal" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series BLT Slap Echo" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Chicken Salad Vibrato" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Chili Dog Octave" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Corned Beef Reverb" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Fish & Chips 7 Band EQ" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series French Fries Auto Wah" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series French Toast Octave Distortion" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Grilled Cheese Distortion" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Hash Browns Flanger" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Lemon Pitcher Tuner" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Milkshake Chorus" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Pastrami Overdrive" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series PB&J Peanut Butter & Jelly Delay" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Pepperoni Phaser" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Rocky Road Spinning Speaker" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Surf & Turf Compressor" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series T-Bone Distortion" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Mini Series Tuna Melt Tremolo" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Original Series Cool Cat" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Danelectro" :model "Original Series Daddy O" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Original Series Dan Echo" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Original Series Fab Tone" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Reel Echo" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Spring King Reverb" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Wasabi AC-1 Chorus-Trem" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Wasabi AD-1 Forward-Reverse Delay" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Wasabi AO-1 Overdrive" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Wasabi AS-1 Rock-a-Bye" :distributor true :isolator true :other false}
   {:brand "Danelectro" :model "Wasabi AX-1 Distortion" :distributor true :isolator true :other false}
   {:brand "Darkglass Electronics" :model "Duality Dual Fuzz Engine" :distributor true :isolator true :other false}
   {:brand "Darkglass Electronics" :model "Microtubes B3K CMOS Bass Overdrive" :distributor true :isolator false :other true :comment "SupaNova"}
   {:brand "Darkglass Electronics" :model "Microtubes B7K Analog Bass Preamp" :distributor true :isolator false :other true :comment "SupaNova"}
   {:brand "Darkglass Electronics" :model "Microtubes Vintage" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Darkglass Electronics" :model "Microtubes Vintage Deluxe" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Apocalypse" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Echo Dream 2" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Death By Audio" :model "Fuzz War" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Ghost Echo" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Interstellar Overdriver" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Interstellar Overdriver Deluxe" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "KILL KILL FILTER" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Octave Clang" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Robot" :distributor false :isolator true :other false}
   {:brand "Death By Audio" :model "Soundwave Breakdown" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Supersonic Fuzz Gun" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Sunshine Reverberation" :distributor true :isolator true :other false}
   {:brand "Death By Audio" :model "Total Sonic Annihilation" :distributor true :isolator true :other false}
   {:brand "Demeter" :model "BEQ-PB Bass EQ Preamp Pedal" :distributor true :isolator true :other false}
   {:brand "Demeter" :model "COMP-1 Compulator" :distributor true :isolator true :other false :comment "mini jack adapter"}
   {:brand "Demeter" :model "DD-1 Double Overdrive" :distributor true :isolator true :other false}
   {:brand "Demeter" :model "FOD-1 Fat Overdrive" :distributor true :isolator true :other false}
   {:brand "Demeter" :model "Fuzzulator" :distributor true :isolator true :other false}
   {:brand "Demeter" :model "MB-2B Midboost/Fat Control Pedal" :distributor true :isolator true :other false}
   {:brand "Demeter" :model "OD-1 Over Drivulator" :distributor true :isolator true :other false}
   {:brand "Demeter" :model "RRP Reverbulator" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Demeter" :model "STRM-1 Stereo Tremulator" :distributor true :isolator true :other false}
   {:brand "Demeter" :model "TRM-1 Tremulator" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "33" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "525" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Aenima" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Bit" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Dark Boost" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Destructo Noctavia" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Disaster Fuzz" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Dream Mangler" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Electric Brown" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Eye Of God" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Godzilla" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "GZ" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Hyperon" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Karaoke Party" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "LP" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Never Drive" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "OK" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Rocket" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Shoe Gazer" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Spectacular aenima" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "US" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "Vintage Fuzz Master" :distributor true :isolator true :other false}
   {:brand "Devi-Ever" :model "White Spider" :distributor true :isolator true :other false}
   {:brand "DHA" :model "Fuzzy Feeling" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT1 Acoustic" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT1 Blender" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT1 MK3 Bass" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT1 MK3 Guitar" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT1 Purist Bass" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "DHA" :model "VT1 Purist Guitar" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "DHA" :model "VT1 Standard Bass" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT1 Standard Guitar" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT1 Bass Compressor" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT1 Standard Bass Compressor" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT1 Tremolo" :distributor true :isolator true :other false}
   {:brand "DHA" :model "VT2 Dual" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "DHA" :model "VT2 Dual Bass" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "DHA" :model "VT2 Dual Bass Custom" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "DHA" :model "VT2 Dual Custom Guitar" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "DHA" :model "VT2 Twin Bass" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "DHA" :model "VT2 Twin Guitar" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "DHA" :model "VT2 Dual Std Bass" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "DHA" :model "VT2 Dual Std Guitar" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Diamond" :model "Alter Ego" :distributor true :isolator true :other true}
   {:brand "Diamond" :model "Boost-EQ" :distributor true :isolator true :other false}
   {:brand "Diamond" :model "Compressor" :distributor true :isolator true :other false}
   {:brand "Diamond" :model "Diamond Router" :distributor true :isolator true :other false}
   {:brand "Diamond" :model "Fireburst" :distributor true :isolator true :other false}
   {:brand "Diamond" :model "Halo Chorus" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Diamond" :model "Memory Lane" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Diamond" :model "Phase" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Diamond" :model "ST-MIFALSE" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Diamond" :model "Vibrato" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Digitech" :model "Whammy 1~4" :distributor false :isolator false :other false}
   {:brand "Digitech" :model "Whammy DT" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Digitech" :model "Whammy 5" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Dinosaural" :model "OPA-101" :distributor true :isolator true :other false}
   {:brand "Dr. Scientist" :model "Woofer Wailer" :distributor true :isolator true :other false}
   {:brand "Dr. Scientist" :model "The Cleanness" :distributor true :isolator true :other false}
   {:brand "Dr. Scientist" :model "Frazz Dazzler" :distributor true :isolator true :other false}
   {:brand "Dr. Scientist" :model "The Elements" :distributor true :isolator true :other false}
   {:brand "Dr. Scientist" :model "Sunny Day Delay" :distributor true :isolator true :other false}
   {:brand "Dr. Scientist" :model "Cosmichorus" :distributor true :isolator true :other false}
   {:brand "Dr. Scientist" :model "Reverberator" :distributor true :isolator true :other false}
   {:brand "Dr. Scientist" :model "The Tremolessence" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "CM95 Clyde McCoy CryBaby" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "105Q Cry Baby Bass Wah" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "535Q Cry Baby Multi-Wah" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "BG95 Buddy Guy Signature Wah" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "DB01 Dimebag Signature Wah" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "EVH95 Eddie Van Halen Signature Wah" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "GCB95 Cry Baby" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "GCB95F Cry Baby Classic" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "JBF3 Joe Bonamassa Fuzz Face" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "Dunlop" :model "JC95 Jerry Cantrell Signature Wah" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "JD4S Rotovibe" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "JDF2 Fuzz Face" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "Dunlop" :model "JH1D Jimi Hendrix Signature Wah" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "JHF1 Jimi Hendrix Fuzz Face" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "Dunlop" :model "JHOC1 Jimi Hendrix Octavio" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "Dunlop" :model "KH95 Kirk Hammett Wah" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "EW95V Mr Crybaby Super V/W" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "Q95 Cry Baby Q Wah Wah" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "SW95 Slash Signature Wah" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Dunlop" :model "TS1 Tremolo Stereo Pan" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "UV1 Uni-Vibe" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Dunlop" :model "UV1SC Uni-Vibe Stereo Chorus" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "ZW45 Zakk Wylde Signature" :distributor true :isolator true :other false}
   {:brand "Dunlop" :model "Uni-vibe" :distributor true :isolator true :other false}
   {:brand "Duhram Electronics" :model "Crazy Horse" :distributor true :isolator true :other false}
   {:brand "Durham Electronics" :model "Mucho Boosto" :distributor true :isolator true :other false}
   {:brand "Durham Electronics" :model "Sex Drive" :distributor true :isolator true :other false}
   {:brand "Durham Electronics" :model "Zia Drive" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "ARF Attack Release Filter" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "Gears" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "Memento" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "Eau Claire Thunder" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "the Great Destroyer" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "Pitchgrinder" :distributor false :isolator true :other true :comment "TimeLord"}
   {:brand "Dwarfcraft Devices" :model "She Fuzz" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "Total Spack Vibes" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "hair of the dog" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "Hax" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "the Internet" :distributor true :isolator true :other false}
   {:brand "Dwarfcraft Devices" :model "Zhago" :distributor true :isolator true :other false}
   {:brand "Earthquaker devices" :model "Afterneath" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Arpanoid" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Arrows" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Hoof fuzz" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "the Warden" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Dunes" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Disaster Transport SR" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Disaster Transport" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Disaster Transport Jr." :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Crimson Drive" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Hoof Reaper Octave Fuzz" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Talons" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Earthquaker devices" :model "The Depths" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Earthquaker devices" :model "Bit Commander" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Black Eye" :distributor true :isolator true :other false}
   {:brand "Earthquaker devices" :model "Dirt Transmitter" :distributor true :isolator true :other false}
   {:brand "Earthquaker devices" :model "Dispatch Master" :distributor true :isolator true :other false}
   {:brand "Earthquaker devices" :model "Dream Crusher" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Ghost Echo" :distributor true :isolator true :other false}
   {:brand "Earthquaker devices" :model "Grand Orbiter" :distributor true :isolator true :other false}
   {:brand "Earthquaker devices" :model "Hummingbird" :distributor true :isolator true :other false}
   {:brand "Earthquaker devices" :model "Monarch" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Earthquaker devices" :model "Organizer" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Pitchbay" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Terminal" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Tentacle" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Tone Reaper" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Rainbow Machine" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Sea Machine" :distributor false :isolator true :other true :comment "ACA-AOK"}
   {:brand "Earthquaker devices" :model "Sound Shank" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Speaker Cranker" :distributor true :isolator true :other false}
   {:brand "Earthquaker devices" :model "Tone Job" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Earthquaker devices" :model "the Warden" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "White Light" :distributor false :isolator true :other false}
   {:brand "Earthquaker devices" :model "Zap Machine" :distributor true :isolator true :other false}
   {:brand "EBS" :model "Bass IQ" :distributor true :isolator true :other false}
   {:brand "EBS" :model "DynaVerb" :distributor true :isolator true :other false}
   {:brand "EBS" :model "EBS Tremolo" :distributor true :isolator true :other false}
   {:brand "EBS" :model "EBS UniChorus" :distributor true :isolator true :other false}
   {:brand "EBS" :model "Micro Bass 2" :distributor true :isolator true :other false}
   {:brand "EBS" :model "MultiComp" :distributor true :isolator true :other false}
   {:brand "EBS" :model "MultiDrive" :distributor true :isolator true :other false}
   {:brand "EBS" :model "OctaBass" :distributor true :isolator true :other false}
   {:brand "EBS" :model "Valve Drive" :distributor false :isolator false :other false}
   {:brand "EBS" :model "Wah One" :distributor true :isolator true :other false}
   {:brand "Effector 13" :model "Never Drive Plus" :distributor true :isolator true :other false}
   {:brand "Effector 13" :model "Punch Love Plus" :distributor true :isolator true :other false}
   {:brand "Effector 13" :model "Soda Meiser Plus" :distributor true :isolator true :other false}
   {:brand "Effector 13" :model "Sucka Punch" :distributor true :isolator true :other false}
   {:brand "Effector 13" :model "Truly Beautiful Disaster" :distributor true :isolator true :other false}
   {:brand "El Musico Loco" :model "Wee Beaver" :distributor true :isolator true :other false}
   {:brand "El Musico Loco" :model "Big Wee Beaver" :distributor true :isolator true :other false}
   {:brand "El Musico Loco" :model "Blisterlily" :distributor true :isolator true :other false}
   {:brand "El Musico Loco" :model "Siamese Scream" :distributor true :isolator true :other false}
   {:brand "El Musico Loco" :model "El Boludo" :distributor true :isolator true :other false}
   {:brand "El Musico Loco" :model "Honky Dong" :distributor true :isolator true :other false}
   {:brand "El Musico Loco" :model "74 Overdrive" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "22500 Dual Stereo Looper" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "1# Echo" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "12 AY7 Mic Pre" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "44 Magnum" :distributor false :isolator false :other true}
   {:brand "Electro-Harmonix" :model "45000 Multi-Track looping Recorder" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "8 Step Program" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "16 Second Delay" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Analogizer" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Bad Stone" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Bass Balls" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Bass Blogger" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Bass Metaphors" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Bass Micro Synthesizer" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Big Muff Pi (Russian)" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "Electro-Harmonix" :model "Big Muff Pi (USA)" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Big Muff Pi with tone wicker" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Big Muff Nano" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Black Finger" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "Cathedral Stereo Reverb" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Chillswitch" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Clone Theory" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Crying Bass" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Crying tone" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Deluxe Bass big Muff" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Deluxe Electric Mistress" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Deluxe Memory Boy" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Deluxe Memory Man" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Deluxe Memory Man" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Deluxe Memory Man - Tap Tempo" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Deluxe Memory Man - with Hazarai" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Doctor Q" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Double Muff" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "East River Drive" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "English Muff'n" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "Enigma" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Epitome" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Expression pedal" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Electric Mistress (original green)" :distributor false :isolator false :other true :comment "Doubler + mini jack adapter"}
   {:brand "Electro-Harmonix" :model "EHX Tortion" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Flanger Hoax" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Electro-Harmonix" :model "Freeze" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Frequncey Analyzer" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "Germanium 4 Big Muff Pi" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Germanium OD" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Glove" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Graphic Fuzz" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Good Vibes" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "HOG" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Electro-Harmonix" :model "HOG 2" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Holier Grail" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Holiest Grail" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Holy Grail" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Holy Grail Plus" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Holy Grail Neo" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Holy Stain" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "Hot Tubes" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Iron Lung" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Pitchfork" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Knockout Attack Equalizer" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Little Big Muff" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "LPB-1" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "LPB-2ube" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "Memory Boy" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Memory Toy" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Metal Muff" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Micro Metal Muff" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Micro POG" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Micro Q-Tron" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Micro Synthesizer" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Mole" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Muff Overdrive" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Nano Bass Balls" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Nano Clone" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Neo Clone" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Nano DR Q" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Neo Mistress" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Nano Pog" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Nano LPB1" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Nano Small Stone" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Octave Multiplexer" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Octavix" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Pan Pedal" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Pocket Metal Muff" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "POG" :distributor false :isolator false :other true :comment "Doubler + Line6 cable adapter"}
   {:brand "Electro-Harmonix" :model "POG 2" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Pulsar" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Q-Tron" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Q-Tron+" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Ravish" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Riddle" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Ring thing" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "RTG" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Screaming Bird" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Signal Pad" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Silencer" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Slammi" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Small Clone" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Small Stone" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Soul Food Bass" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Soul Food" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Soul Preacher" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Steel Leather" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Stereo Electric Mistress" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Stereo Memory Man" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Stereo Memory Man with Hazarai" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Stereo Polychorus" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Stereo Polyphase" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Stereo Pulsar" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Super Pulsar" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "Super Ego" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Talking Pedal" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Tone Tattoo" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Tube E.Q" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "Tube Zipper" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "Turnip Greens" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Electro-Harmonix" :model "The POG" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Electro-Harmonix" :model "The Wiggler" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "The Worm" :distributor false :isolator false :other true :comment "ElectroMan"}
   {:brand "Electro-Harmonix" :model "Tube EQ" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "Tube Zipper" :distributor false :isolator false :other false}
   {:brand "Electro-Harmonix" :model "V256 Vocoder" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Voice Box" :distributor false :isolator true :other false}
   {:brand "Electro-Harmonix" :model "Volume Pedal" :distributor true :isolator true :other false}
   {:brand "Electro-Harmonix" :model "White Finger" :distributor false :isolator false :other false}
   {:brand "EMMA" :model "DB-1 DiscomBOBulator" :distributor true :isolator true :other false}
   {:brand "EMMA" :model "OMP-1 OnoMATOpoeia" :distributor true :isolator true :other false}
   {:brand "EMMA" :model "RF-1 ReezaFRATzitz" :distributor true :isolator true :other false}
   {:brand "EMMA" :model "PisdiYAUwot" :distributor true :isolator true :other false}
   {:brand "EMMA" :model "StinkBug" :distributor true :isolator true :other false}
   {:brand "EMMA" :model "TM-1 TransMORGrifier" :distributor true :isolator true :other false}
   {:brand "Empress" :model "Buffer" :distributor true :isolator true :other false}
   {:brand "Empress" :model "Buffer+" :distributor true :isolator true :other false}
   {:brand "Empress" :model "Compressor" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Empress" :model "Distortion" :distributor true :isolator true :other false}
   {:brand "Empress" :model "Fuzz" :distributor true :isolator true :other false}
   {:brand "Empress" :model "Germ Drive" :distributor true :isolator true :other false}
   {:brand "Empress" :model "Heavy" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Empress" :model "MIDIbox" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Empress" :model "Multidrive" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Empress" :model "Nebulus" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Empress" :model "ParaEQ w/Boost" :distributor true :isolator true :other false}
   {:brand "Empress" :model "Super Delay" :distributor false :isolator false :other true :comment "SupaNova Plus Reverse Polarity Adaptor"}
   {:brand "Empress" :model "Vintage Modified Super Delay" :distributor false :isolator false :other true :comment "SupaNova Plus Reverse Polarity Adaptor"}
   {:brand "Empress" :model "Tape Delay" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Empress" :model "Tap Tremolo" :distributor true :isolator true :other false}
   {:brand "Empress" :model "Phaser" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Eventide" :model "ModFactor" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Eventide" :model "PitchFactor" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Eventide" :model "TimeFactor" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Eventide" :model "Space" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Eventide" :model "H9 Core" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Eventide" :model "H9" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Eventide" :model "H9 Max" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Fairfield Circuitry" :model "The Barbershop" :distributor true :isolator true :other false}
   {:brand "Fairfield Circuitry" :model "Randy's Revenge" :distributor false :isolator true :other false}
   {:brand "Fairfield Circuitry" :model "Four Eyes" :distributor true :isolator true :other false}
   {:brand "Fairfield Circuitry" :model "Operator!?" :distributor true :isolator true :other false}
   {:brand "Fairfield Circuitry" :model "Meet Maude" :distributor true :isolator true :other false}
   {:brand "Fairfield Circuitry" :model "The Unpleasent Surprise" :distributor true :isolator true :other false}
   {:brand "Fairfield Circuitry" :model "The Accountant" :distributor true :isolator true :other false}
   {:brand "Foxrox" :model "Octron 2" :distributor true :isolator true :other false}
   {:brand "Foxrox" :model "Octron" :distributor true :isolator true :other false}
   {:brand "Foxrox" :model "Festival Overdrive" :distributor true :isolator true :other false}
   {:brand "Foxrox" :model "AquaVibe" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Foxrox" :model "Paradox TZF2" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Foxrox" :model "Hot Silcon Fuzz" :distributor true :isolator true :other false}
   {:brand "Foxrox" :model "CC Hybrid" :distributor true :isolator true :other false}
   {:brand "Foxrox" :model "ZIM" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "69" :distributor false :isolator true :other false :comment "reverse polarity adapter"}
   {:brand "Fulltone" :model "70" :distributor true :isolator true :other false :comment "mini jack adapter"}
   {:brand "Fulltone" :model "Bass Drive Mosfet" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Choralflange" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Cylde Deluxe Wah" :distributor false :isolator true :other false}
   {:brand "Fulltone" :model "Cylde Standard Wah" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Deja 2" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Distortion Pro" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Fat Boost 2 (FB-2)" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Full Drive 2 Mosfet" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Full Drive 2 (Non Mosfet)" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Full Drive 3" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Fulltone" :model "GT-500" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Mini Deja Vibe" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "OCD" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Octafuzz" :distributor false :isolator true :other false :comment "reverse polarity adapter"}
   {:brand "Fulltone" :model "Plimsoul" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Secret Freq" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Catalyst" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Soul Bender" :distributor false :isolator true :other false :comment "reverse polarity adapter"}
   {:brand "Fulltone" :model "Supa-Trem" :distributor true :isolator true :other false}
   {:brand "Fulltone" :model "Ultimate Octave" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Afterlife" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Broke Dick Peanut Gallery" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Dark Driving" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Darkest Driving" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Demon King" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Grey Stache" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Heliotropic" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Oh See Demon" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Rat King" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Rat Tail" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Ram the Manparts" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Terrordactyl" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Tremorslo" :distributor true :isolator true :other false}
   {:brand "Fuzzrocious" :model "Zuul" :distributor true :isolator true :other false}
   {:brand "Free The Tone" :model "SOV-2" :distributor true :isolator true :other false}
   {:brand "Free The Tone" :model "FB-2 Final Booster" :distributor true :isolator true :other false}
   {:brand "Free The Tone" :model "HB-2 Heat Blaster" :distributor true :isolator true :other false}
   {:brand "Teese" :model "RMC-1" :distributor true :isolator true :other false}
   {:brand "Teese" :model "RMC-2" :distributor true :isolator true :other false}
   {:brand "Teese" :model "RMC-3" :distributor true :isolator true :other false}
   {:brand "Teese" :model "Picture Wah RMC-4" :distributor true :isolator true :other false}
   {:brand "Teese" :model "Wizard Wah RMC-5" :distributor true :isolator true :other false}
   {:brand "Teese" :model "Wheels of Fire Wah RMC-6" :distributor true :isolator true :other false}
   {:brand "Teese" :model "Joe Walsh Signature Wah RMC-7" :distributor true :isolator true :other false}
   {:brand "Teese" :model "Guitar Eqwahlyzer RMC-8" :distributor true :isolator true :other false}
   {:brand "Teese" :model "Bass Eqwahlyzer RMC-9" :distributor true :isolator true :other false}
   {:brand "Teese" :model "RMC-10" :distributor true :isolator true :other false}
   {:brand "GigFFALSE" :model "Chopper" :distributor true :isolator true :other false}
   {:brand "GigFFALSE" :model "Kilo- Wah" :distributor true :isolator true :other false}
   {:brand "GigFFALSE" :model "Johny Hiland Kilo-Wah" :distributor true :isolator true :other false}
   {:brand "GigFFALSE" :model "PanEcho Delay" :distributor true :isolator true :other false}
   {:brand "GigFFALSE" :model "Sub-Wah" :distributor true :isolator true :other false}
   {:brand "GigFFALSE" :model "Mega-Wah" :distributor true :isolator true :other false}
   {:brand "GigFFALSE" :model "Peter Frampton Mega-Wah" :distributor true :isolator true :other false}
   {:brand "GigFFALSE" :model "Pro- Chop" :distributor true :isolator true :other false}
   {:brand "GigFFALSE" :model "VOD" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "BB-2 Bottom Blaster" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "BE-2 Bottom Equalizer" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "CB3- Cool Booster" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "FL-3 Flanger" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "FZ-2000 Guyatone Fuzz 2000" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "HD-3 Hot Drive" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "MC-3 Micro Chorus" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "MD-3 Micro Digital Delay" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "MM-X Metal Monster" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Guyatone" :model "MO-3 Micro Octaver" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "MT-3 Micro Tuner" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "OD-2 + Overdrive+" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "SS-3 Sonic Shaper" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "ST-2 Compressor/Sustainer" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "SV-2 Slow Volume" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "TD-X Tube Echo" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Guyatone" :model "TZ-2 The Fuzz" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "Ultrem Optical Tremolo" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "Ultron Auto Wah" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "VT-3 Vintage Tremolo" :distributor true :isolator true :other false}
   {:brand "Guyatone" :model "VT-X Vintage Tremolo" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Guyatone" :model "WR-3 Wah Rocker" :distributor true :isolator true :other false}
   {:brand "Hartman" :model "Analog Flanger" :distributor true :isolator true :other false}
   {:brand "Hartman" :model "Envelope Filter" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "HEXE guitar Electronics" :model "Bitcrusher III" :distributor true :isolator true :other false}
   {:brand "HEXE guitar Electronics" :model "Drive Masala" :distributor true :isolator true :other false}
   {:brand "HEXE guitar Electronics" :model "Fire Starter III" :distributor true :isolator true :other false}
   {:brand "HEXE guitar Electronics" :model "Melusine II" :distributor true :isolator true :other false}
   {:brand "HEXE guitar Electronics" :model "Radar phase/vibrato" :distributor true :isolator true :other false}
   {:brand "HEXE guitar Electronics" :model "Revolver II" :distributor true :isolator true :other false}
   {:brand "Hiwatt" :model "Custom tape echo" :distributor false :isolator false :other true :comment "Custom Triple Doubler"}
   {:brand "Hiwatt" :model "Tube Distortion" :distributor false :isolator false :other true :comment "Custom Triple Doubler"}
   {:brand "Hiwatt" :model "Tube High Gain Distortion" :distributor false :isolator false :other true :comment "Custom Triple Doubler"}
   {:brand "Hiwatt" :model "Tube Overdrive" :distributor false :isolator false :other true :comment "Custom Triple Doubler"}
   {:brand "Hiwatt" :model "Tube Phaser" :distributor false :isolator false :other true :comment "Custom Triple Doubler"}
   {:brand "Hiwatt" :model "Tube Tremolo" :distributor false :isolator false :other true :comment "Custom Triple Doubler"}
   {:brand "Homebrew Electronics" :model "Big D" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Bytchn Swytchn A/B/C Switcher" :distributor true :isolator true :other false :comment "EL PASO"}
   {:brand "Homebrew Electronics" :model "Compressore Retro" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Dos Mos" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Full Meatal Jacket" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Germania" :distributor false :isolator true :other false :comment "reverse polarity adapter"}
   {:brand "Homebrew Electronics" :model "Hematoma" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Medicine Bawl" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Mimic-Analog Delay" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Power Screamer" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Psilosybe" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "THC (Three Hound Chorus)" :distributor true :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Ultimate Fuzz Octave" :distributor false :isolator true :other false}
   {:brand "Homebrew Electronics" :model "Uno Mos/Bajo Mos" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "AD80 Analog Delay" :distributor false :isolator false :other true :comment "Doubler + Mini Jack cable adapter"}
   {:brand "Ibanez" :model "AD9 Analog Delay" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "AD99 Analog Delay" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "AW7 Autowah" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "BC9 Bi Mode Chorus" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "CF7 Chorus/Flanger" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "CP10 Compressor" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "CS505 Stereo Chorus" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Ibanez" :model "CS9 Stereo Chorus" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "DE7 Delay/Echo" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "DL5 Digital Delay" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "DML10 Digital Modulation Delay II" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "DS7 Distortion" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "EM5 Echo Machine" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "ES2 Echo Shifter" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "FL9 Flanger" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "FZ7 Fuzz" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "GE9 Graphic Equalizer" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "Jemini" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "LF7 Lo Fi" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "PD7 Phat-Hed Bass Overdrive" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "PH7 Phaser" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "PM7 Phase Modulator" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "PT9 Phaser" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "SB7 Synthesizer Bass" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "SD9 Sonic Distortion" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "SH7 7th Heaven" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "SM7 Smash Box" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "SM9 Super Metal" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "ST9 Super Tubescreamer" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "TS10 Tubescreamer" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "TS5 Tubescreamer" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "TS7 Tubescreamer" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "TS808 Tubescreamer" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "TS9 DX Turbo Tubescreamer" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "TS9 Tubescreamer" :distributor true :isolator true :other false}
   {:brand "Ibanez" :model "WD7 Weeping Demon" :distributor true :isolator true :other false}
   {:brand "Infanem" :model "The 141T Fuzz" :distributor true :isolator true :other false}
   {:brand "Infanem" :model "The 141G Fuzz" :distributor true :isolator true :other false}
   {:brand "Infanem" :model "Analog Harmony Synthesizer" :distributor false :isolator true :other false}
   {:brand "Infanem" :model "Compact Faye Sing" :distributor true :isolator true :other false}
   {:brand "Infanem" :model "Faye's Her" :distributor true :isolator true :other false}
   {:brand "Infanem" :model "Second Voice" :distributor false :isolator true :other false}
   {:brand "Infanem" :model "Second Voice Deluxe" :distributor false :isolator true :other false}
   {:brand "Infanem" :model "Small Echo Array" :distributor false :isolator true :other false}
   {:brand "Infanem" :model "Step" :distributor true :isolator true :other false}
   {:brand "Infanem" :model "The Driving Notion" :distributor true :isolator true :other false}
   {:brand "Infanem" :model "There's No Future In Fuzz" :distributor true :isolator true :other false}
   {:brand "Iron Ether" :model "FrantaBit" :distributor true :isolator true :other false}
   {:brand "Iron Ether" :model "Nimbus" :distributor true :isolator true :other false}
   {:brand "Iron Ether" :model "Oxide" :distributor true :isolator true :other false}
   {:brand "Iron Ether" :model "Polytope" :distributor true :isolator true :other false}
   {:brand "Iron Ether" :model "QF2 Analog Multiband Distortion" :distributor true :isolator true :other false}
   {:brand "Iron Ether" :model "Xerograph" :distributor true :isolator true :other false}
   {:brand "Iron Ether" :model "Xerograph Deluxe" :distributor true :isolator true :other false}
   {:brand "Iron Ether" :model "Subterranea" :distributor true :isolator true :other false}
   {:brand "ISP" :model "Decimator" :distributor true :isolator true :other false}
   {:brand "JHS" :model "4 Wheeler" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Astro Mess" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Alpine" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Angry Charlie Brown" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Banana Boost" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Bun-Runner" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Blender" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Charlie Brown" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Colour Box" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "JHS" :model "Double Barrel" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Firefly" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Honey Comb Deluxe" :distributor true :isolator true :other false}
   {:brand "JHS" :model "The Kilt" :distributor true :isolator true :other false}
   {:brand "JHS" :model "JHS-808" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "JHS" :model "Lime Aid" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Low Drive" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Morning Glory" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Pandamonium" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Panther Delay" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Panther Cub Delay" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Prestige" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Pulp 'N' Peel" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Pollinator" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Unicorn" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Mini-Bomb-Boost" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Mini-Foot-Fuzz" :distributor true :isolator true :other false}
   {:brand "JHS" :model "State-Line" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Superbolt" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Sweet-Tea" :distributor true :isolator true :other false}
   {:brand "JHS" :model "Warble Tron" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "1962x 2-mode Limited British Overdrive" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "The Absolute Wurst" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Phase 24" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Caverns" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Seafoam Chorus" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Dynatrem" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Red Dirt" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Keeley Compressor Pro" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Fuzz Head" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Son Of Fuzz Head" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Fuzzy Pizdets" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Java Boost" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "PSI" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Katana Boost" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Keeley Compressor" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Keeley Compressor Bassist" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Keeley Looper" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "StahlHammer" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Steak and Eggs" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Steep Mountain" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Limiting Amplifier" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Neutrino" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Nova Wah" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Nocturner Reverb" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Mag Echo" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "Time Machine Boost" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "war Ensemble" :distributor true :isolator true :other false}
   {:brand "Keeley" :model "White Sands" :distributor true :isolator true :other false}
   {:brand "KORG" :model "KP1 KAOSS Pad" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "KORG" :model "KP2 KAOSS Pad" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "KORG" :model "KP3 KAOSS Pad" :distributor false :isolator false :other true :comment "Doubler + reverse polarity cable adapter"}
   {:brand "KORG" :model "Pitchblack Tuner PB01" :distributor true :isolator true :other false}
   {:brand "KORG" :model "Pitchblack+ Tuner PB02" :distributor true :isolator true :other false}
   {:brand "Kingsley" :model "Jester v1" :distributor false :isolator false :other false}
   {:brand "Kingsley" :model "Jester v2" :distributor false :isolator false :other false}
   {:brand "Kingsley" :model "Jouster v1" :distributor false :isolator false :other false}
   {:brand "Kingsley" :model "Jouster v2" :distributor false :isolator false :other false}
   {:brand "Kingsley" :model "Juggler" :distributor false :isolator false :other false}
   {:brand "LazyJ" :model "Cruiser" :distributor false :isolator true :other false :comment "works much better with Isolator or VB-DC"}
   {:brand "Lehle" :model "Lehle 1at3 SGoS" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Lehle 3at1 SGoS" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Lehle D.Loop SGoS" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Lehle Dual SGoS" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Lehle Little Dual" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Little Lehle" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Little Lehle II" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Sunday Driver" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Sunday Driver SW" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Sunday Driver XLR" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Parallel M" :distributor true :isolator true :other false}
   {:brand "Lehle" :model "Parallel L" :distributor true :isolator true :other false}
   {:brand "Line6" :model "AM4" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Line6" :model "DL4" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Line6" :model "DM4" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Line6" :model "FM4" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Line6" :model "MM4" :distributor false :isolator false :other true :comment "EvenFlo"}
   {:brand "Line6" :model "M5" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Line6" :model "M9" :distributor false :isolator false :other true :comment "Line6 Cable adapter and all other pedals MUST be isolated"}
   {:brand "Line6" :model "M13" :distributor false :isolator false :other true :comment "Line6 Cable adapter and all other pedals MUST be isolated"}
   {:brand "Line6" :model "Tonecore Pedals" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Constrictor" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Crunchtone" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Dr. Distorto" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Echo Park" :distributor false :isolator true :other false}
   {:brand "Line 6" :model "Relay G30" :distributor false :isolator true :other false}
   {:brand "Line 6" :model "Relay G50" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Liqua-Flange" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Otto Filter" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Roto-Machine" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Space Chorus" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Tap Tremolo" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Uber Metal" :distributor false :isolator true :other false}
   {:brand "Line6" :model "Verbzilla" :distributor false :isolator true :other false}
   {:brand "Love Pedal" :model "200lbs of Tone" :distributor true :isolator true :other false}
   {:brand "Love Pedal" :model "Cot 50" :distributor true :isolator true :other false}
   {:brand "Love Pedal" :model "Eternity Over Drive" :distributor true :isolator true :other false}
   {:brand "Love Pedal" :model "Karl" :distributor true :isolator true :other false}
   {:brand "Love Pedal" :model "Purple Plexi" :distributor true :isolator true :other false}
   {:brand "Love Pedal" :model "Super 6" :distributor true :isolator true :other false}
   {:brand "Love Pedal" :model "Tchula" :distributor true :isolator true :other false}
   {:brand "Love Pedal" :model "Pickle Vibe" :distributor true :isolator true :other false}
   {:brand "Loud Button Electronics" :model "Atomic Subharmonic" :distributor true :isolator true :other false}
   {:brand "Loud Button Electronics" :model "Balls Deep" :distributor true :isolator true :other false}
   {:brand "Loud Button Electronics" :model "Morphine Dream" :distributor true :isolator true :other false}
   {:brand "Loud Button Electronics" :model "WTF" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Little Green Wonder" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Fire Red Fuzz" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Sky Blue Overdrive" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Sweet Honey Overdrive" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Blueberry Bass Overdrive" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Deep Blue Delay" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Mellow Yellow Trem" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Snow White Auto Wah" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Snow White Bass Auto Wah" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Stone Grey Distrotion" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Mighty Red Distortion" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Tiny Orange Phaser" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Forest Green Compressor" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Ruby Red Booster" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Electric Blue Chorus" :distributor true :isolator true :other false}
   {:brand "Mad Proffesor" :model "Silver Spring Reverb" :distributor true :isolator true :other false}
   {:brand "Markbass" :model "MB7 Booster" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Markbass" :model "MB Mini Boost" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Markbass" :model "Compressore" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Markbass" :model "MB Mini Dist" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Markbass" :model "MB7 Distorsore" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Markbass" :model "Bass Tube Marker" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Markbass" :model "MB Octaver" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Markbass" :model "Super Synth" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Markbass" :model "Riverbero" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "MarkLCustom" :model "Vanilla Sky" :distributor true :isolator true :other false}
   {:brand "MarkLCustom" :model "Jazzy Drive" :distributor true :isolator true :other false}
   {:brand "MarkLCustom" :model "Jazzy Boost" :distributor true :isolator true :other false}
   {:brand "MarkLCustom" :model "Jazzy Drive Deluxe" :distributor true :isolator true :other false}
   {:brand "Malekko" :model "B:ASSMASTER" :distributor false :isolator true :other true :comment "VB-BC"}
   {:brand "Malekko" :model "B:ASSMASTER Germanium" :distributor false :isolator true :other true :comment "VB-BC"}
   {:brand "Malekko" :model "Chaos" :distributor false :isolator true :other false}
   {:brand "Malekko" :model "EKKO 616 MKII" :distributor true :isolator true :other false}
   {:brand "Malekko" :model "lofi EKKO 616 MKII" :distributor true :isolator true :other false}
   {:brand "Malekko" :model "FETISH" :distributor false :isolator true :other true :comment "VB-BC"}
   {:brand "Malekko" :model "HELIUM" :distributor false :isolator true :other true :comment "VB-BC"}
   {:brand "Malekko" :model "SLOIKA" :distributor false :isolator true :other false}
   {:brand "Malekko" :model "UNITY" :distributor false :isolator true :other false}
   {:brand "Malekko" :model "Omicron A.D" :distributor true :isolator true :other false}
   {:brand "Malekko" :model "Omicron BIT" :distributor false :isolator true :other false}
   {:brand "Malekko" :model "Omicron CHORUS" :distributor true :isolator true :other true :comment "SupaNova"}
   {:brand "Malekko" :model "Omicron COMP" :distributor true :isolator true :other false}
   {:brand "Malekko" :model "Omicron E.FILTER" :distributor false :isolator true :other true :comment "SupaNova"}
   {:brand "Malekko" :model "Omicron FUZZ" :distributor true :isolator true :other false}
   {:brand "Malekko" :model "Omicron PHASE" :distributor true :isolator true :other false}
   {:brand "Malekko" :model "Omicron SPRING" :distributor false :isolator true :other false}
   {:brand "Malekko" :model "Omicron TREM" :distributor true :isolator true :other false}
   {:brand "Malekko" :model "Omicron VIBRATO" :distributor false :isolator true :other true :comment "SupaNova"}
   {:brand "Marshall" :model "BB-2 Bluesbreaker II" :distributor true :isolator true :other false}
   {:brand "Marshall" :model "Blues Breaker" :distributor true :isolator true :other false}
   {:brand "Marshall" :model "Drive Master" :distributor true :isolator true :other false}
   {:brand "Marshall" :model "ED-1 Compressor" :distributor true :isolator true :other false}
   {:brand "Marshall" :model "Guv'nor" :distributor true :isolator true :other false}
   {:brand "Marshall" :model "GV-2 Guv'nor" :distributor true :isolator true :other false}
   {:brand "Marshall" :model "JH-1 Jackhammer" :distributor true :isolator true :other false}
   {:brand "Marshall" :model "Shred Master" :distributor true :isolator true :other false}
   {:brand "Marshall" :model "SV-2 Supervibe Chorus" :distributor true :isolator true :other false}
   {:brand "Marshall" :model "VT-1 Vibratrem" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "AD-9 Analog Delay" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "AD-900 Analog Delay" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "AD80 Analog Delay" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "AF-9 Auto Filter" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "CP101 Compressor" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "CS-550 Stereo Chorus" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "CS-9Pro Stereo Chorus" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "CS505 Stereo Chorus" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "D&S Distortion & Sustainer" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "D&S II Distortion & Sustainer II" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "DS-830 Distortion Master" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "FL-9 Flanger" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "FL301 Flanger" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "GE601 Graphic Equalizer" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "OD-820 Over Drive Pro" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "OD-9 Overdrive" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "OD808 Overdrive" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "PH-350 Rotary Phaser" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "PT999 Phase Tone" :distributor true :isolator true :other false}
   {:brand "Maxon" :model "SD-9 Sonic Distortion" :distributor true :isolator true :other false}
   {:brand "MI Audio" :model "Blue Boy Deluxe" :distributor true :isolator true :other false}
   {:brand "MI Audio" :model "Blues Pro Overdrive" :distributor true :isolator true :other false}
   {:brand "MI Audio" :model "Boost n Buff" :distributor true :isolator true :other false}
   {:brand "MI Audio" :model "Crunch Box Overdrive" :distributor true :isolator true :other false}
   {:brand "MI Audio" :model "GI Fuzz" :distributor true :isolator true :other false}
   {:brand "MI Audio" :model "Neo Fuzz" :distributor true :isolator true :other false}
   {:brand "MI Audio" :model "Tube Zone Overdrive" :distributor true :isolator true :other false}
   {:brand "MI Audio" :model "Megalith Delta" :distributor true :isolator true :other false}
   {:brand "Mission engineering" :model "Expressionator" :distributor true :isolator true :other false}
   {:brand "Mission engineering" :model "Rewah Pro Bass" :distributor true :isolator true :other false}
   {:brand "Mission engineering" :model "Rewah Pro" :distributor true :isolator true :other false}
   {:brand "Mission engineering" :model "Rewah st" :distributor true :isolator true :other false}
   {:brand "Mission engineering" :model "Vm-Pro" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Mission engineering" :model "Vm-pro-Pz" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Mojo Hand" :model "Analogue Filter 443" :distributor true :isolator true :other false}
   {:brand "Mojo Hand" :model "Bluebonnet Overdrive" :distributor true :isolator true :other false}
   {:brand "Mojo Hand" :model "Colossus Fuzz" :distributor true :isolator true :other false}
   {:brand "Mojo Hand" :model "Nebula IV Phaser" :distributor true :isolator true :other false}
   {:brand "Mojo Hand" :model "One Ton Bee Fuzz" :distributor true :isolator true :other false}
   {:brand "Mojo Hand" :model "Recoil Delay" :distributor true :isolator true :other false}
   {:brand "Mojo Hand" :model "Rook Overdrive" :distributor true :isolator true :other false}
   {:brand "Mojo Hand" :model "Sugar Baby Tremolo" :distributor true :isolator true :other false}
   {:brand "Mojo Hand" :model "Zephyr Fuzz" :distributor true :isolator true :other false}
   {:brand "Mooer" :model "Liquidiver" :distributor true :isolator true :other false}
   {:brand "Mooer" :model "Micro Pedal Range" :distributor true :isolator true :other false}
   {:brand "Mooer" :model "Super Bender" :distributor true :isolator true :other false}
   {:brand "Moog" :model "MF Boost" :distributor true :isolator true :other false}
   {:brand "Moog" :model "MF Chorus" :distributor true :isolator true :other false}
   {:brand "Moog" :model "MF Delay" :distributor true :isolator true :other false}
   {:brand "Moog" :model "MF Drive" :distributor true :isolator true :other false}
   {:brand "Moog" :model "MF Flange" :distributor true :isolator true :other false}
   {:brand "Moog" :model "MF Ring" :distributor true :isolator true :other false}
   {:brand "Moog" :model "MF Trem" :distributor true :isolator true :other false}
   {:brand "Moog" :model "Moogerfooger Analog Delay MF-104Z" :distributor false :isolator true :other "* use with reverse polarity adapter"}
   {:brand "Moog" :model "Moogerfooger Cluster Flux MF-108M" :distributor true :isolator false :other "* use with reverse polarity adapter"}
   {:brand "Moog" :model "Moogerfooger FreqBox MF-107" :distributor false :isolator false :other true :comment "* use with reverse polarity adapter"}
   {:brand "Moog" :model "Moogerfooger Low Pass Filter MF-101" :distributor false :isolator true :other "* use with reverse polarity adapter"}
   {:brand "Moog" :model "Moogerfooger MuRF MF-105/105B/105M" :distributor false :isolator true :other "* use with reverse polarity adapter"}
   {:brand "Moog" :model "Moogerfooger Phaser MF-103" :distributor false :isolator true :other "* use with reverse polarity adapter"}
   {:brand "Moog" :model "Moogerfooger Ring Modulator MF-102" :distributor false :isolator true :other "* use with reverse polarity adapter"}
   {:brand "Moog" :model "Multi-Pedal MP-201" :distributor false :isolator false :other false}
   {:brand "Moonphaser" :model "MoonDriver" :distributor true :isolator true :other false}
   {:brand "Moonphaser" :model "Moonphaser" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "3 Plus" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Active D.I" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Bass Drive" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Chorus" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Compressor" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Equalizer" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Fuzz Fourteen" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Lotus Octah" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "OD-DS" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Over Drive" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Signal Boost" :distributor true :isolator true :other false}
   {:brand "Moollon" :model "Tremolo" :distributor true :isolator true :other false}
   {:brand "morpheus" :model "Bomber" :distributor false :isolator false :other true :comment "SupaNova plus a polarity adapter"}
   {:brand "morpheus" :model "Capo" :distributor false :isolator false :other true :comment "SupaNova plus a polarity adapter"}
   {:brand "morpheus" :model "Droptune" :distributor false :isolator false :other true :comment "SupaNova plus a polarity adapter"}
   {:brand "Morley" :model "ABY Selector Combiner" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Classic Wah CLW" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Dual Bass Wah PBA-2" :distributor true :isolator true :other false}
   {:brand "Morley" :model "George Lynch Tripler" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Mark Tremonti Power Wah MARK 1" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Pro Series II Distortion Wah Volume PDW-II" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Pro Series II Wah PWA-II" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Pro Series II Wah Volume PWV-II" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Pro Series Volume PVO" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Stereo Chorus Volume SCV" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Steve Vai Bad Horsie 2 Wah VAI-2" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Steve Vai Bad Horsie Wah VAI-1" :distributor true :isolator true :other false}
   {:brand "Morley" :model "Steve Vai Little Alligator Volume PLA" :distributor true :isolator true :other false}
   {:brand "MXR" :model "CSP026 '74 Vintage Phase 90" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "MXR" :model "CSP028 '76 Vintage Dyna Comp" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "MXR" :model "CSP101SL MXR Script Phase 90 with LED" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "MXR" :model "CSP105 '75 Vintage Phase 45" :distributor false :isolator false :other true :comment "VB-BC"}
   {:brand "MXR" :model "CSP202 Custom Comp" :distributor true :isolator true :other false}
   {:brand "MXR" :model "CSP099 Phase 99" :distributor true :isolator true :other false}
   {:brand "MXR" :model "CSP203 La Machine" :distributor true :isolator true :other false}
   {:brand "MXR" :model "CSP233 Micro Amp +" :distributor true :isolator true :other false}
   {:brand "MXR" :model "DD11 Dime Distortion" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "EP101 Echoplex Preamp" :distributor true :isolator true :other false}
   {:brand "MXR" :model "EVH Flanger" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "EVH117 EVH Flanger" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "EVH90 EVH Phase 90" :distributor true :isolator true :other false}
   {:brand "MXR" :model "KFK1 Kerry King 10-Band EQ" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "M81 Bass Preamp" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M101 Phase 90" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M102 Dyna Comp" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M103 Blue Box" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M104 Distortion+" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M107 Phase 100" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M108 10-Band Graphic EQ" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "M109 6-Band Graphic EQ" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M115 Distortion III" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M116 Fullbore Metal" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M117 Flanger" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "M120 Auto Q Envelope Filter" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M132 Super Comp" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M133 Micro Amp" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M134 Stereo Chorus" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "M135 Smart Gate Noise Gate" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M148 Micro Chorus" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M152 Micro Flanger" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M159 Stereo Tremolo" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "M169 Carbon Copy Analog Delay" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M173 Classic 108 Fuzz" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M181 Bass Blow Torch Distortion" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "M182 El Grande Bass Fuzz" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M188 Bass Auto Q" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M193 GT-OD Overdrive" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M195 Noise Clamp" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M234 Analog Chorus" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M235 Smart Gate Pro" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "MXR" :model "M264 FET Driver" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M288 Bass Octave" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M288 Bass Octave Deluxe" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M77 Custom Badass Modified OD" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M78 Custom Badass '78 Distortion" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M80 Bass DI+" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M82 Bass Envelope Filter" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M87 Bass Compressor" :distributor true :isolator true :other false}
   {:brand "MXR" :model "M88 Bass Octave" :distributor true :isolator true :other false}
   {:brand "MXR" :model "ZW38 Black Label Chorus" :distributor true :isolator true :other false}
   {:brand "MXR" :model "ZW44 Zakk Wylde Berzerker Overdrive" :distributor true :isolator true :other false}
   {:brand "MXR" :model "ZW90 Wylde Phase" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "AB-1 Switcher" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "AB-V A/B Selector Box" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "Alex 1 Looper" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "CH-D Chorus" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "CO-2 Compressor" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "DD 800- Dig Delay" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "DT-1 Distortion" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "DT-SN Distortion Pedal" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "FU-Z Fuzz" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "Loop Master" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "MF-1 Midi Controller" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "MF-2 Midi Controller" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "MIX-41C Mixer" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "MIX-42C Mixer" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "MS-4 Midi Switch Controller" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "MV-C Midi Volume Controller" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "ODR-1 Over Drive" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "ODR-1 Plus Natural Over Drive" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "ODR-B Bass Over Drive" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "ODR-S Overdrive Special" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "PH-D Phaser" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "PRE-C Pre-amplifier/Booster" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "Pre-Master" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "PRE1- pre-amplifier" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "Split 4 Active Split Box" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "Split Master" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "SPX 31 Signal Splitter and Mixer" :distributor true :isolator true :other false}
   {:brand "Nobels" :model "TRX- Tremelo" :distributor true :isolator true :other false}
   {:brand "Origin Effects" :model "Cali76" :distributor true :isolator true :other false}
   {:brand "Origin Effects" :model "Cali76-STD" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "Cali76 STD-TX-P" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "Cali-G" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "Cali76-G-P" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "Cali76-TFALSE" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "Cali76-TX-L" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "SlideRIG" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "Cali76-C" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "Cali76-CD" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "SlideRIG-C" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "SlideRIG-CD" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Origin Effects" :model "Cali76-CB" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Paul Cochraine" :model "Tim" :distributor true :isolator true :other false}
   {:brand "Paul Cochraine" :model "Timmy" :distributor true :isolator true :other false}
   {:brand "Pedal Monsters" :model "Mad Hatter" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "A/B/C box" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "G-2" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "G-2/NB-2 Duplex" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "G-2/SS-3 Duplex" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "LD-1" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "LD-2" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "LD-3" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "LP-2" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "NB-2" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "NB-3" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "NBM-2" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "NG-2" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "P-1" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "P-2" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "P-2/NB-2 Duplex" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "P-2/SS-3 Duplex" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "SS-3" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "SS-3/NB-2 Duplex" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "ST-2" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "ST-2/NB-2" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "TB-83 Extra" :distributor true :isolator true :other false}
   {:brand "Pete Cornish" :model "TB-83 Extra Duplex" :distributor true :isolator true :other false}
   {:brand "Petersen" :model "Strobo Stomp 2" :distributor true :isolator true :other false}
   {:brand "Petersen" :model "StroboFlip Compact Virtual Strobe Tuner" :distributor false :isolator false :other false}
   {:brand "Pigtronix" :model "Aria" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Attack Sustain" :distributor false :isolator false :other true :comment "ElPaso + reverse polarity cable adapetr"}
   {:brand "Pigtronix" :model "Bass Envelope Phaser" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Bass Station" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Bass Fat Boost" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Class A Boost" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "D'Angelico II" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "D'Angelico New York" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Disnortion" :distributor false :isolator false :other true :comment "ElPaso + reverse polarity cable adapetr"}
   {:brand "Pigtronix" :model "Nova Disnortion" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Echolution" :distributor false :isolator false :other true :comment "ElPaso + reverse polarity cable adapetr"}
   {:brand "Pigtronix" :model "Echolution Chrome" :distributor false :isolator false :other true :comment "ElPaso + reverse polarity cable adapetr"}
   {:brand "Pigtronix" :model "Echolution 2" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Echolution 2 Deluxe" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Echolution 2 Ultra Pro" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Echolution 2 Filter Pro" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "EP-1 Envelope Phaser" :distributor false :isolator false :other true :comment "ElPaso + reverse polarity cable adapetr"}
   {:brand "Pigtronix" :model "Bernie Worrell Signature Envelope Phaser" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Fat Drive" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Gate Keeper" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Keymaster" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Philosopher bass compressor" :distributor false :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Philosophers tone" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Philosophers tone Germanium Gold LTD" :distributor true :isolator true :other false}
   {:brand "Pigtronix" :model "Philosopher king" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Philosopher's Rock" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Quantum time Modulator" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "PolySaturator" :distributor true :isolator true :other false}
   {:brand "Pigtronix" :model "Rototron" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Tremvelope" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Mothership" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "Infinty Looper" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "XL Fat Drive" :distributor true :isolator true :other true :comment "Doubler"}
   {:brand "Pigtronix" :model "War Hog" :distributor false :isolator false :other true :comment "Doubler"}
   {:brand "ProCo" :model "DeuceTone Rat" :distributor true :isolator true :other false}
   {:brand "ProCo" :model "Juggernaut Bass Rat" :distributor true :isolator true :other false}
   {:brand "ProCo" :model "Rat 2" :distributor true :isolator true :other false}
   {:brand "ProCo" :model "Solo" :distributor true :isolator true :other false}
   {:brand "ProCo" :model "Turbo Rat" :distributor true :isolator true :other false}
   {:brand "ProCo" :model "Vintage RAT" :distributor true :isolator true :other false}
   {:brand "ProCo" :model "You Dirty Rat" :distributor true :isolator true :other false}
   {:brand "Providence" :model "ADC-3 Anadime Chorus" :distributor true :isolator true :other false}
   {:brand "Providence" :model "SDR-5 Sonic Drive" :distributor true :isolator true :other false}
   {:brand "Providence" :model "HBL-3 Heat Blaster" :distributor true :isolator true :other false}
   {:brand "Providence" :model "SOV-2 Stampede OD" :distributor true :isolator true :other false}
   {:brand "Providence" :model "SDT-2 Stampede DT" :distributor true :isolator true :other false}
   {:brand "Providence" :model "VLC-1 Velvet Comp" :distributor true :isolator true :other false}
   {:brand "Providence" :model "PHF-1 Phase Force" :distributor true :isolator true :other false}
   {:brand "Providence" :model "FBT-1 Final Booster" :distributor true :isolator true :other false}
   {:brand "Providence" :model "FDR-1F Flame Drive" :distributor true :isolator true :other false}
   {:brand "Providence" :model "SLD-1F Silky Drive" :distributor true :isolator true :other false}
   {:brand "Providence" :model "DLY-4 Chrono Delay" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Radial" :model "Bass Bone" :distributor false :isolator false :other true :comment "ElPaso+NCF Filter"}
   {:brand "Radial" :model "Bigshot PB1 Power Booster" :distributor true :isolator true :other false}
   {:brand "Radial" :model "Bigshot SW2" :distributor true :isolator true :other false}
   {:brand "Radial" :model "Cabbone speaker Cabinet Switcher" :distributor true :isolator true :other false}
   {:brand "Radial" :model "Classic Tube Distortion" :distributor false :isolator false :other true :comment "ElPaso+NCF Filter"}
   {:brand "Radial" :model "Hot British Tube Distortion" :distributor false :isolator false :other true :comment "ElPaso+NCF Filter"}
   {:brand "Radial" :model "Loopbone" :distributor false :isolator false :other true :comment "ElPaso+NCF Filter"}
   {:brand "Radial" :model "Plexi-Tube" :distributor false :isolator false :other true :comment "ElPaso+NCF Filter"}
   {:brand "Radial" :model "SGI-TFALSE" :distributor false :isolator false :other true :comment "ElPaso+NCF Filter"}
   {:brand "Radial" :model "Switch Bone ABY Switcher" :distributor false :isolator false :other true :comment "ElPaso+NCF Filter"}
   {:brand "Radial" :model "Trimode Tube Distortion" :distributor false :isolator false :other true :comment "ElPaso+NCF Filter"}
   {:brand "Retrosonic" :model "Chorus" :distributor false}
   {:brand "Red Witch" :model "Deluxe Moon Phaser" :distributor true :isolator true :other false}
   {:brand "Red Witch" :model "Empress Chorus" :distributor true :isolator true :other false}
   {:brand "Red Witch" :model "Fuzz God" :distributor true :isolator true :other false}
   {:brand "Red Witch" :model "Pentavocal Tremolo" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Banshee" :distributor false :isolator false :other false}
   {:brand "Rocktron" :model "Big Crush Compressor" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Black Cat Moan" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Cyborg Digital Delay" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Cyborg Digital Distortion" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Cyborg Reverb" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Deep Blue" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Heart Attack" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Hex Volume/Expression Pedal" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Hush The Pedal" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Hypnoticflange" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Metal Planet" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Nitro" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Pulse Tremolo" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Rampage Pedal" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Short Timer" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Silver Dragon" :distributor false :isolator false :other false}
   {:brand "Rocktron" :model "Sonic Glory" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "XTune" :distributor true :isolator true :other false}
   {:brand "Rocktron" :model "Zombie" :distributor true :isolator true :other false}
   {:brand "Roger Linn" :model "AdrenaLinn" :distributor false  :isolator true :other true :comment "TimeLord + a Reverse Polarity Cable Adater - the red one"}
   {:brand "Roger Linn" :model "AdrenaLinn II" :distributor false  :isolator true :other true :comment "TimeLord + a Reverse Polarity Cable Adater - the red one"}
   {:brand "Roger Linn" :model "AdrenaLinn III" :distributor false  :isolator true :other true :comment "TimeLord + a Reverse Polarity Cable Adater - the red one"}
   {:brand "Roger Mayer" :model "Concorde and Treble Booster" :distributor false :isolator true :other false}
   {:brand "Roger Mayer" :model "Vision Octavia" :distributor false :isolator true :other false}
   {:brand "Roger Mayer" :model "Vision Wah Special" :distributor true :isolator true :other false}
   {:brand "Roger Mayer" :model "Voodoo-Vibe +" :distributor true :isolator true :other false}
   {:brand "Roger Mayer" :model "Voodoo-Vibe Jr" :distributor true :isolator true :other false}
   {:brand "Rothwell" :model "Atomic Booster" :distributor true :isolator true :other false}
   {:brand "Rothwell" :model "F1 Booster" :distributor true :isolator true :other false}
   {:brand "Rothwell" :model "Hell Bender" :distributor true :isolator true :other false}
   {:brand "Rothwell" :model "Switch Blade" :distributor true :isolator true :other false}
   {:brand "Selah" :model "Scarlett Love Overdrive" :distributor true :isolator true :other false}
   {:brand "Selah" :model "Feather Drive" :distributor true :isolator true :other false}
   {:brand "Seymour Duncan" :model "Lava Box" :distributor true :isolator true :other false}
   {:brand "Seymour Duncan" :model "Paranormal Bass Direct Box" :distributor true :isolator true :other false}
   {:brand "Seymour Duncan" :model "Pickup Booster" :distributor true :isolator true :other false}
   {:brand "Seymour Duncan" :model "Power Grid Distortion" :distributor true :isolator true :other false}
   {:brand "Seymour Duncan" :model "Shape Shifter" :distributor true :isolator true :other false}
   {:brand "Seymour Duncan" :model "Tweak Fuzz" :distributor true :isolator true :other false}
   {:brand "Seymour Duncan" :model "Twin Tube Classic" :distributor false :isolator false :other false}
   {:brand "Seymour Duncan" :model "Twin Tube Mayhem" :distributor false :isolator false :other false}
   {:brand "Skrydstrup" :model "ODR1" :distributor true :isolator true :other false}
   {:brand "Skrydstrup" :model "ODR2" :distributor true :isolator true :other false}
   {:brand "Skrydstrup" :model "DST1" :distributor true :isolator true :other false}
   {:brand "Skrydstrup" :model "BR1" :distributor true :isolator true :other false}
   {:brand "Skrydstrup" :model "TR1" :distributor true :isolator true :other false}
   {:brand "Skrydstrup" :model "BF2M" :distributor true :isolator true :other false}
   {:brand "Skrydstrup" :model "DDL" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Skreddy" :model "Dual Loop" :distributor true :isolator true :other false}
   {:brand "Skreddy" :model "Ernie" :distributor true :isolator true :other false}
   {:brand "Skreddy" :model "Lunar Module" :distributor true :isolator true :other false}
   {:brand "Skreddy" :model "Mayo" :distributor true :isolator true :other false}
   {:brand "Skreddy" :model "Mayonaise" :distributor true :isolator true :other false}
   {:brand "Skreddy" :model "Pink Flesh" :distributor true :isolator true :other false}
   {:brand "Skreddy" :model "Screw Driver" :distributor true :isolator true :other false}
   {:brand "Skreddy" :model "Top Fuel" :distributor true :isolator true :other false}
   {:brand "Skreddy" :model "Zero" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Wah Filter" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Source Audio" :model "Phaser/Flanger" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Source Audio" :model "MIDI/EXP Pedal" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Source Audio" :model "Hot Hand 3" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Multiwave Disortion (soundblox)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Multiwave bass Disortion (soundblox)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Classic Disortion (soundblox)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Bass Envelope Filter (soundblox)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Guitar Envelope Filter (soundblox)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Tri-Mod Wah (soundblox)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Tri-mod Phaser (soundblox)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Tri-mod Flanger (soundblox)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Orbital modulator (soundblox 2)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Multiwave Distortion (soundblox 2)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Multiwave bass Disortion (soundblox 2)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Dimention Reverb (soundblox 2)" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Multiwave Distortion Pro" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Multiwave Bass Distortion Pro" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Classic Distortion" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Guitar Envelope Filter" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Bass Envelope Filter" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Poly-Mod Filter Pro" :distributor true :isolator true :other false}
   {:brand "Source Audio" :model "Programmble EQ" :distributor true :isolator true :other false}
   {:brand "Strymon" :model "El Capistan" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "Brigadier" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "BlueSky" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "Deco" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "DIG" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "Orbit" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "Ola" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "OB.1" :distributor true :isolator true :other false}
   {:brand "Strymon" :model "Lex" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "Flint" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "Timeline" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Strymon" :model "Mobius" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "Subdecay" :model "Anamnesis Echo" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Blackstar" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Echobox" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Liquid Sunshine" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Noisebox" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Octasynth" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Prometheus" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Prometheus DLFALSE" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Proteus" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Quasar DLFALSE" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Quasar Quantum" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Spring Theory" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Starlight" :distributor true :isolator true :other false}
   {:brand "Subdecay" :model "Super Nova Drive" :distributor true :isolator true :other false}
   {:brand "Snazzy Fx" :model "Mini-Ark" :distributor false :isolator true :other false}
   {:brand "Snazzy Fx" :model "Tracer City" :distributor false :isolator true :other false}
   {:brand "Snazzy Fx" :model "Wow and Flutter" :distributor false :isolator true :other false}
   {:brand "TC Electronic" :model "Arena Reverb" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "BodyRez" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Classic Booster - Distortion" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Classic Sustain - Parametric EQ" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Classic TC XII Phaser" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "NDR-1 Nova Drive" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "TC Electronic" :model "ND-1 Nova Delay" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "TC Electronic" :model "NDY-1 Nova Dynamics" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "TC Electronic" :model "NM-1 Nova Modulator" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "TC Electronic" :model "RPT-1 Nova Repeater" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "TC Electronic" :model "NR-1 Nova Reverb" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "TC Electronic" :model "Vintage Octa Screamer" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "SCF Stereo Chorus Flanger" :distributor false :isolator false :other false}
   {:brand "TC Electronic" :model "VPD1" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Spark Booster" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Spark Booster Mini" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint T2 Reverb" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Alter Ego Vintage Echo" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Alter Ego x4 Vintage Echo" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Toneprint The Dreamscape" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Helix Phaser" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Toneprint FlashBack Delay" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Toneprint FlashBack x 4" :distributor false :isolator false :other true :comment "TimeLord"}
   {:brand "TC Electronic" :model "Flashback Mini" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Corona Chorus" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Corona Mini Chorus" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Vortex Flanger" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Vortex Mini Flanger" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Hall of Fame Reverb" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Hall of Fame Mini Reverb" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "TonePrint Shaker Vibrato" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "MojoMojo Overdrive" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Dark Matter Distortion" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Ditto" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Ditto Gold" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Ditto X2" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Ditto Mic Looper" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Rottweiler Distortion" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "PolyTune Mini" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Polytune Mini 2" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Polytune Noir" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "PolyTune" :distributor true :isolator true :other false}
   {:brand "TC Electronic" :model "Polytune 2" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "American Woman" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "Bass Compactor" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "Boost D.L.A" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "Boost R.V.B" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "Comptortion" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "Double Drive" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "Double Drive 3FALSE" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "Killer Wail" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "Midi Moose" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "Midi Mouse" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "TRI-O.D" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "XXL" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "XXL Bass Edition" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "XXL Guitar Edition" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp Classic" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp GT2" :distributor true :isolator true :other true :comment "possible mini jack adapter"}
   {:brand "Tech21 NYC" :model "SansAmp Tri-AC Programmable" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp Bass Driver Deluxe" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp Bass Driver DI Programmable" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp Bass Driver DI" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp Para Driver DI" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp Acoustic DI" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp XDI" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp Liverpool" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp British" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp Blonde" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp California" :distributor true :isolator true :other false}
   {:brand "Tech21 NYC" :model "SansAmp VT Bass" :distributor true :isolator true :other false}
   {:brand "Teese" :model "RMC1" :distributor true :isolator true :other false}
   {:brand "Teese" :model "RMC2" :distributor true :isolator true :other false}
   {:brand "Teese" :model "RMC3" :distributor true :isolator true :other false}
   {:brand "Teese" :model "Wheels Of Fire RMC6" :distributor true :isolator true :other false}
   {:brand "Teese" :model "Wizard Wah RMC5" :distributor true :isolator true :other false}
   {:brand "TheGigRig" :model "Angrybot buffer" :distributor true :isolator true :other false}
   {:brand "TheGigRig" :model "G2" :distributor true :isolator false :other false}
   {:brand "TheGigRig" :model "Pro/MIDI 8" :distributor true :isolator false :other false}
   {:brand "TheGigRig" :model "Pro/MIDI 14" :distributor true :isolator false :other false}
   {:brand "TheGigRig" :model "QuarterMaster 4/6" :distributor true :isolator true :other false}
   {:brand "TheGigRig" :model "QuarterMaster 8/10" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "TheGigRig" :model "QMX 4/6" :distributor true :isolator true :other false}
   {:brand "TheGigRig" :model "QMX8/10" :distributor true :isolator false :other true :comment "TimeLord"}
   {:brand "TheGigRig" :model "Loopy2" :distributor true :isolator true :other false}
   {:brand "TheGigRig" :model "Remote Loopy2" :distributor true :isolator true :other false}
   {:brand "TheGigRig" :model "WetBox" :distributor true :isolator true :other false}
   {:brand "TheGigRig" :model "Z Cable" :distributor true :isolator true :other false}
   {:brand "T-Rex" :model "Alberta" :distributor true :isolator true :other false}
   {:brand "T-Rex" :model "Bass Juice" :distributor true :isolator true :other false}
   {:brand "T-Rex" :model "Bloody Mary" :distributor true :isolator true :other false}
   {:brand "T-Rex" :model "Comp-Nova" :distributor true :isolator true :other false}
   {:brand "T-Rex" :model "Dr Swamp" :distributor true :isolator true :other false}
   {:brand "T-Rex" :model "Michael Angelo Batio" :distributor true :isolator true :other false}
   {:brand "T-Rex" :model "Moller" :distributor true :isolator true :other false}
   {:brand "T-Rex" :model "Mudhoney" :distributor true :isolator true :other false}
   {:brand "T-Rex" :model "Replica" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "T-Rex" :model "Room-mate" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "T-Rex" :model "SpinDoctor" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "T-Rex" :model "Squeezer" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "T-Rex" :model "Tremster" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "T-Rex" :model "Viper" :distributor false :isolator false :other true :comment "SupaNova"}
   {:brand "Verellen Amplifiers" :model "Big Spider" :distributor false :isolator true :other false}
   {:brand "Verellen Amplifiers" :model "Meatsmoke Pre Amplifier" :distributor false :isolator false :other false}
   {:brand "Verellen Amplifiers" :model "Skyhammer Pre Amplifier" :distributor false :isolator false :other false}
   {:brand "Visual Sound" :model "V2 Jekyll & Hyde" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Route 66" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 H20" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Double Trouble" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Angry Fuzz" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Route 808" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Open Road" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Comp 66" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Son of Hyde" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Liquid Chorus" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Truetone" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "V2 Vans Warped Distortion" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "Visual Volume" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "GarageTone Oil Can Phaser" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "GarageTone Chainsaw Distortion" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "GarageTone Drivetrain Overdrive" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "GarageTone Tremolo" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "GarageTone Axle Grease Delay" :distributor true :isolator true :other false}
   {:brand "Visual Sound" :model "Dual Tap Delay" :distributor true :isolator true :other false}
   {:brand "Voodoo Lab" :model "Analog Chorus" :distributor true :isolator true :other false}
   {:brand "Voodoo Lab" :model "Micro-Vibe" :distributor true :isolator true :other false}
   {:brand "Voodoo Lab" :model "Proctavia" :distributor false :isolator true :other false}
   {:brand "Voodoo Lab" :model "Sparkle Drive" :distributor true :isolator true :other false}
   {:brand "Voodoo Lab" :model "Super-Fuzz" :distributor false :isolator true :other false}
   {:brand "Voodoo Lab" :model "Tremolo II" :distributor true :isolator true :other false}
   {:brand "Vox" :model "Wah" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "Walrus Audio" :model "Bellwether" :distributor true :isolator true :other false}
   {:brand "Walrus Audio" :model "Deep Six Compressor" :distributor true :isolator true :other false}
   {:brand "Walrus Audio" :model "Descent" :distributor true :isolator true :other false}
   {:brand "Walrus Audio" :model "Harvester" :distributor true :isolator true :other false}
   {:brand "Walrus Audio" :model "Iron Horse Distortion" :distributor true :isolator true :other false}
   {:brand "Walrus Audio" :model "Janus Tremolo/Fuzz" :distributor true :isolator true :other false}
   {:brand "Walrus Audio" :model "Jupiter Fuzz" :distributor true :isolator true :other false}
   {:brand "Walrus Audio" :model "Mayflower Overdrive" :distributor true :isolator true :other false}
   {:brand "Walrus Audio" :model "Plainsman" :distributor true :isolator true :other false}
   {:brand "Walrus Audio" :model "Voyager Overdrive" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Paisley Drive" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Hot Wired" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Ecstasy" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Black '65" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Plexi-Drive" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "SLOstortion" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Pinnacle" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Pinnacle Deluxe" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Plextortion" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Triple Wreck" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Leviathan Fuzz" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Faux Analog Echo" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Faux Tape Echo" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Faux Spring Reverb" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Ego Compressor" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Nirvana Chorus" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Talent Booster" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Clean Buffer" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Super Plex" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Underdog" :distributor true :isolator true :other false}
   {:brand "Wampler" :model "Cranked" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Angry Troll Linear Boost Amplifier" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Aqua Puss Analog Delay" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Blue Hippo Chorus" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Echo-puss Analog Delay" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Fat Sandwich Harmonic Saturator" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Green Rhino Overdrive MKII" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Havalina Germanium Fuzz" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Pork Loin Soft Clip Injection" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Red Llama" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Saucy" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Saffron Squeeze" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Supa-Puss" :distributor true :isolator true :other false}
   {:brand "Way Huge Electronics" :model "Swollen Pickle MKII Jumbo Fuzz" :distributor true :isolator true :other false}
   {:brand "WMDevices" :model "Arcane Preamp" :distributor true :isolator true :other false}
   {:brand "WMDevices" :model "Geiger Counter" :distributor true :isolator true :other false}
   {:brand "WMDevices" :model "Geiger Counter Civilian Issue" :distributor true :isolator true :other false}
   {:brand "WMDevices" :model "FatMan" :distributor true :isolator true :other false}
   {:brand "WMDevices" :model "Super FatMan" :distributor true :isolator true :other false}
   {:brand "WMDevices" :model "Utility Noise Gate" :distributor true :isolator true :other false}
   {:brand "WMDevices" :model "Utility Parametric EQ" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "AC Booster" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "RC Booster" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "BB Booster" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "AC Plus +" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "BB Plus +" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "EP Booster" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "RoboTalk" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "SP Compressor" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "X Blender" :distributor true :isolator true :other false}
   {:brand "Xotic" :model "Xotic Wah" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Basstortion" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Box of Rock" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Channel 2" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Distortron" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Double rock" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Fat Fuzz Factory" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Fuzz Factory" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Fuzz Factory 7" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Fuzz Probe" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Fuzzolo" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Inventobox" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Instant lofi junky" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Jonny Octave" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Lo-Fi Loop Junky" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Loop gate" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Machine" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Mastotron" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Octane 3" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Ooh Wah II" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Ring Tone" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Seek Trem" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Seek Wah" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Super Duper 2 in 1" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Super Hard-On" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Super Ringtone" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Super Seekwah" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Super SeekTrem" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "Sonar" :distributor true :isolator true :other false}
   {:brand "ZVEX" :model "The Box of Rock" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Tremolo Probe" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Tremorama" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Vexter Fuzz Factory" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Wah Probe" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   {:brand "ZVEX" :model "Woolly Mammoth" :distributor true :isolator true :other true :comment "if no DC input use VB-BC"}
   ])
