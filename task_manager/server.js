//prebuild app from host in cluser has been uploaded to folder named Application-0_client_20230629174209

const express = require('express');
const app = express();

let tasks = [];

app.use(express.json());

app.post('/tasks', (req, res) => {
  const { taskName } = req.body;
  tasks.push(taskName);
  res.status(201).send('Task added successfully');
});

app.get('/tasks', (req, res) => {
  res.json(tasks);
});

const PORT = 5000;
app.listen(PORT, () => {
  console.log(`Server running on port ${PORT}`);
});