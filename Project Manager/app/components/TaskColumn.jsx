import React, { useState } from "react";

const TaskColumn = ({
  title,
  tasks,
  onTaskMove,
  onTaskDelete,
  onTaskAdd,
  onTaskUpdate,
  columnTitle,
}) => {
  const [editableTask, setEditableTask] = useState(null);

  const handleDragStart = (e, taskId) => {
    e.dataTransfer.setData("taskId", taskId.toString());
  };

  const handleDragOver = (e) => {
    e.preventDefault();
  };

  const handleDrop = (e, targetColumn) => {
    e.preventDefault();
    const taskId = Number(e.dataTransfer.getData("taskId"));
    onTaskMove(taskId, targetColumn);
  };

  const handleDelete = (taskId) => {
    onTaskDelete(taskId);
  };

  const handleEdit = (task) => {
    setEditableTask({ ...task });
  };

  const handleSave = () => {
    onTaskUpdate(editableTask);
    setEditableTask(null);
  };

  const handleInputChange = (e) => {
    setEditableTask({ ...editableTask, title: e.target.value });
  };

  console.log("Rendering TaskColumn");

  return (
    <div className="flex flex-col items-center w-1/4 h-full p-4">
      <div className="bg-gray-100 p-4 rounded-md">
        <h2 className="text-black text-center">{title}</h2>
        <div
          className="flex flex-col items-center w-full mt-4"
          onDragOver={(e) => handleDragOver(e)}
          onDrop={(e) => handleDrop(e, columnTitle)}
        >
          {tasks.length > 0 ? (
            tasks.map((task) => (
              <div
                key={task.id}
                draggable
                onDragStart={(e) => handleDragStart(e, task.id)}
                className="text-black w-full p-4 mb-4 bg-white rounded-md shadow-md cursor-move relative"
              >
                {editableTask && editableTask.id === task.id ? (
                  <>
                    <input
                      type="text"
                      value={editableTask.title}
                      onChange={handleInputChange}
                      className="w-full p-2 border border-gray-300 rounded-md mb-2"
                    />
                    <button
                      onClick={handleSave}
                      className="bg-green-500 text-white p-2 rounded-md hover:bg-green-600 mr-2"
                    >
                      Save
                    </button>
                    <button
                      onClick={() => handleEdit(task)}
                      className="bg-gray-500 text-white p-2 rounded-md hover:bg-gray-600"
                    >
                      Cancel
                    </button>
                  </>
                ) : (
                  <>
                    <div className="flex justify-between items-center">
                      <span>{task.title}</span>
                      <div className="flex items-center space-x-2">
                        <button
                          className="text-red-500 hover:text-red-700 ml-1"
                          onClick={() => handleDelete(task.id)}
                        >
                          X
                        </button>
                        <button
                          onClick={() => handleEdit(task)}
                          className="text-blue-500 hover:text-blue-700 ml-4"
                        >
                          Edit
                        </button>
                      </div>
                    </div>
                  </>
                )}
              </div>
            ))
          ) : (
            <div className="text-black w-full p-4 bg-white rounded-md shadow-md">
            <p>Drag and drop tasks here </p>
            </div>
          )}

          <button
            className="bg-blue-500 text-white p-2 rounded-md hover:bg-blue-600 mt-4"
            onClick={() => onTaskAdd()}>
            <p>Add Task </p>
          </button>
        </div>
      </div>
    </div>
  );
};

export default TaskColumn;
