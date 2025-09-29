lucide.createIcons();

const links = document.querySelectorAll(".sidebar nav a");
const cards = document.querySelectorAll(".card");

links.forEach(link => {
  link.addEventListener("click", e => {
    e.preventDefault();
    links.forEach(l => l.classList.remove("active"));
    link.classList.add("active");
    const target = link.getAttribute("href").substring(1);
    cards.forEach(card => {
      card.classList.remove("active");
      if (card.id === target) card.classList.add("active");
    });
  });
});

function loadWeek(file, title) {
  fetch(file)
    .then(response => response.text())
    .then(data => {
      const projectsTitle = document.getElementById('projects-title');
      const content = document.getElementById('week-content');
      const buttons = document.getElementById('projects-buttons');
      const backBtn = document.getElementById('backBtn');

      // Cambiar título
      projectsTitle.textContent = title;
      projectsTitle.classList.add("week-title");

      // Ocultar botones y mostrar contenido
      buttons.style.display = 'none';
      content.style.display = 'block';
      content.innerHTML = data;

      // Mostrar botón volver
      backBtn.style.display = 'inline-block';

      // Acción volver
      backBtn.onclick = () => {
        content.style.display = 'none';
        content.innerHTML = '';
        buttons.style.display = 'grid';
        projectsTitle.textContent = "PROJECTS";
        projectsTitle.classList.remove("week-title");
        backBtn.style.display = 'none';
      };
    })
    .catch(() => {
      document.getElementById('week-content').innerHTML = "<p>Error cargando el contenido.</p>";
    });
}






