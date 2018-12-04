regExps = {
"exercise_1": /[A-Z][a-z]+/,
"exercise_2": /088[1-9]{7}/,
"exercise_3": /[^0-1]+/,
"exercise_4": /^[a-z][a-zA-Z0-9\._]{2,13}$/,
"exercise_5": /^[0-9]{3}$|1[0-4][0-9][0-9]|1500/,
"exercise_6": /class=('|").*('|")/
};
cssSelectors = {
"exercise_1": "item > java",
"exercise_2": "java.diffClass",
"exercise_3": "java > tag",
"exercise_4": "#someId + item",
"exercise_5": "tag > java + java.class1",
"exercise_6": "item[class*='cl'] > item ",
"exercise_7": "#diffId2 > java + java",
"exercise_8": "#someId"
};
