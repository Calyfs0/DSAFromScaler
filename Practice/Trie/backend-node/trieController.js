const express = require('express');
const cors = require('cors');
const Trie = require('./Trie');
const st = require('./store.json');
let app = express();

app.use(cors());
const trie = new Trie();
const store = st;

for (const word of store) {
  if (word.length > 0) trie.inserString(word);
}

app.use(express.urlencoded({ extended: false }));
app.use(express.json());

app.get('/insert/:word', (req, res, next) => {
  const word = req.params.word;
  if (word.length > 0) trie.inserString(word);

  res.json({ message: 'Inserted Node Success' });
});

app.get('/search/:word', (req, res, next) => {
  const word = req.params.word;
  const found = trie.search(word);
  if (found) res.json({ message: 'Found word in Trie.' });
  else res.json({ message: "Could't find word in Trie." });
});

app.get('/prefix/:word', (req, res, next) => {
  const word = req.params.word;
  const found = trie.startsWith(word);
  if (found) res.json({ message: 'prefix Found :' + found });
  else res.json({ message: "Could't find word in Trie." });
});

app.get('/getsome', (req, res, next) => {
  res.json(st);
});
app.listen(3001);
